package com.yfs.cloud.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.StopWatch;

@ComponentScan("com.yfs")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CloudServerApplication {
	private static final Logger LOG = LoggerFactory.getLogger(CloudServerApplication.class);
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
		SpringApplication.run(CloudServerApplication.class, args);
		sw.stop();

		LOG.info("--------------------------------------------------------");
		LOG.info("------------Service is started. cost:{} s---------------", sw.getTotalTimeSeconds());
		LOG.info("--------------------------------------------------------");
	}
}
