package com.yfs.cloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.util.StopWatch;
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaApplication {


	private static final Logger LOG = LoggerFactory.getLogger(CloudEurekaApplication.class);
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
		SpringApplication.run(CloudEurekaApplication.class, args);
		sw.stop();

		LOG.info("--------------------------------------------------------");
		LOG.info("------------Service is started. cost:{} s---------------", sw.getTotalTimeSeconds());
		LOG.info("--------------------------------------------------------");
	}

}
