package com.xjh.book.nacos;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class SpringCloudNacosSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosSampleProviderApplication.class, args);
    }

}
