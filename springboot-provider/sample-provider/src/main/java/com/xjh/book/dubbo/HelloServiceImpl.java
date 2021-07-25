package com.xjh.book.dubbo;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author xujiahui
 * @create 2021/7/25 16:37
 * @Description
 */
@Service
public class HelloServiceImpl implements IHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]：Hello,%s",serviceName,name);
    }
}
