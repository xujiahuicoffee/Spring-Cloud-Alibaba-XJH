package com.xjh.book.nacos.service;

/**
 * @author user
 * @Description 20211016
 * @create 2021/8/11 22:49
 * 1
 * 2
 * 3
 * 4
 */
public interface IHelloService {

    /**
     * hello world 哈哈哈
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

    public static void method() {
        System.out.println("新年好");
    }
}
