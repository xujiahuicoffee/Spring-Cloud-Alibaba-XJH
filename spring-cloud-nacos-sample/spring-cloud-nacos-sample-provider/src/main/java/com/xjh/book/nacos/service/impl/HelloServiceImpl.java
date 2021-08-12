package com.xjh.book.nacos.service.impl;

import com.xjh.book.nacos.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xujiahui
 * @create 2021/8/11 22:59
 * @Description
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "hello World " + name;
    }

    @Override
    public String sayOthers(String message) {
        return "Hang Zhou huan ying nin " + message;
    }
}
