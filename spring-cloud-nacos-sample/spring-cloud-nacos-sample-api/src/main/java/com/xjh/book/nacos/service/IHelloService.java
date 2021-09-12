package com.xjh.book.nacos.service;

/**
 * @author user
 * @Description
 * @create 2021/8/11 22:49
 */
public interface IHelloService {

    String sayHello(String name);

    /**
     * 说点什么呢  master
     * @param message
     * @return
     */
    String sayOthers(String message);
}
