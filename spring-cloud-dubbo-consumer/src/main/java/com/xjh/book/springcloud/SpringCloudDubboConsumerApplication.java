package com.xjh.book.springcloud;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class SpringCloudDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDubboConsumerApplication.class, args);
	}

}
