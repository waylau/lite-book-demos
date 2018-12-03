/**
 * Welcome to https://waylau.com
 */
package com.waylau.servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

/**
 * Application Main.
 * 
 * @since 1.0.0 2018年3月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Application {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);

		ServletHandler handler = new ServletHandler();
		server.setHandler(handler);

		// URL映射到Servlet
		handler.addServletWithMapping(HelloServlet.class, "/HelloServlet");

		server.start();
		server.join();
	}

}
