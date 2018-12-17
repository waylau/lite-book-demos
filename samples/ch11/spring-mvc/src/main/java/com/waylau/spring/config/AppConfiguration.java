package com.waylau.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * App Configuration.
 * 
 * @since 1.0.0 2018年12月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Configuration
@ComponentScan(basePackages = { "com.waylau" })  
@Import({ MvcConfiguration.class})
@ImportResource("classpath*:*spring.xml")
public class AppConfiguration {

}
