package com.xjh.book.nacos.service;

/**
 * @author user
 * @Description 这是develop分支
 * @create 2021/8/11 22:49
 */
public interface IHelloService {

    /**
     * hello world
     * @param name
     * @return
     */
    String sayHello(String name);

    /**
     * 说点什么呢  master
     * @param message
     * @return
     */
    String sayOthers(String message);
}
