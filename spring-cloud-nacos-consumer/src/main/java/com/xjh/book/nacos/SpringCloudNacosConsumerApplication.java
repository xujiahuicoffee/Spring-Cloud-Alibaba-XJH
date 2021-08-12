package com.xjh.book.nacos;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class SpringCloudNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosConsumerApplication.class, args);
    }

}
