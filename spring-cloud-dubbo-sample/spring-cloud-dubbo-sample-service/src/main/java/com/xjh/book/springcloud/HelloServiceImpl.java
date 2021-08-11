package com.xjh.book.springcloud;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author xujiahui
 * @create 2021/7/25 21:49
 * @Description
 */
@DubboService
public class HelloServiceImpl implements IHelloService{

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]：Hello,%s",serviceName,name);
    }
}
