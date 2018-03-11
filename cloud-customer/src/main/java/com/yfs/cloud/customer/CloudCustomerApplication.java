package com.yfs.cloud.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.util.StopWatch;
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudCustomerApplication {
	private static final Logger LOG = LoggerFactory.getLogger(CloudCustomerApplication.class);
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
		SpringApplication.run(CloudCustomerApplication.class, args);
		sw.stop();

		LOG.info("--------------------------------------------------------");
		LOG.info("------------Service is started. cost:{} s---------------", sw.getTotalTimeSeconds());
		LOG.info("--------------------------------------------------------");
	}
}
