package com.spcloud.spcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// 3 ways to manage the config directory/property files
// a) Github/Gitlab
// b) Local git setup
// c) Direct file path

@EnableConfigServer
@SpringBootApplication
public class SpcloudconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpcloudconfigserverApplication.class, args);
	}

}
