package com.xjh.book.nacos.service.impl;

import com.xjh.book.nacos.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xujiahui
 * @create 2021/8/11 21:57
 * @Description
 */
@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayhello(String name) {
        return "Hello World:" + name;
    }
}
