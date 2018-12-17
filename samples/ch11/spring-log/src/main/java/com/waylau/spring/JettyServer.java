package com.waylau.spring;

import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import com.waylau.spring.config.AppConfiguration;

/**
 * Jetty Server.
 * 
 * @since 1.0.0 2018年12月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class JettyServer {
	static final Logger logger = LoggerFactory.getLogger(JettyServer.class);
	
    private static final int DEFAULT_PORT = 8080;
    private static final String CONTEXT_PATH = "/";
    private static final String MAPPING_URL = "/*";

    public void run() throws Exception {
        Server server = new Server(DEFAULT_PORT);
        server.setHandler(servletContextHandler(webApplicationContext()));
        server.start();
        
        logger.info("Server started!");
        
        server.join();
    }

    private ServletContextHandler servletContextHandler(WebApplicationContext ct) {
    	// 启用Session管理器
        ServletContextHandler handler = 
        		new ServletContextHandler(ServletContextHandler.SESSIONS);
        
        handler.setContextPath(CONTEXT_PATH);
        handler.addServlet(new ServletHolder(new DispatcherServlet(ct)), 
        		MAPPING_URL);
        handler.addEventListener(new ContextLoaderListener(ct));
        
        // 添加Spring Security过滤器
        FilterHolder filterHolder=new FilterHolder(DelegatingFilterProxy.class);
        filterHolder.setName("springSecurityFilterChain"); 
        handler.addFilter(filterHolder, MAPPING_URL, 
        		EnumSet.of(DispatcherType.REQUEST));
        
        return handler;
    }

    private WebApplicationContext webApplicationContext() {
        AnnotationConfigWebApplicationContext context = 
        		new AnnotationConfigWebApplicationContext();
        context.register(AppConfiguration.class);
        return context;
    }
}
