package com.demo.microservices.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul Server, Used as Edge/Proxy/Routing Server.
 * 
 * @author Vijesh Kirodian
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class MicroservicesZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesZuulDemoApplication.class, args);
	}

}
