package com.serapel.inertiacloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InertiaCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(InertiaCloudConfigApplication.class, args);
	}

}
