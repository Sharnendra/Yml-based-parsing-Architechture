package com.service.demoservicearchitechture;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.service.demoservicearchitechture.config.Service;

@SpringBootApplication
public class DemoServiceArchitechtureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceArchitechtureApplication.class, args);
	}
	
	@Bean
	ApplicationRunner applicationRunner(Service serviceConfig)
	{
		return args->{System.out.println(serviceConfig);};
	}

}
