package org.uhcl.edu.eureka.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
@CrossOrigin(origins="http://localhost:4200")
public class EurekaServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaServiceApplication.class, args);
	}
}
