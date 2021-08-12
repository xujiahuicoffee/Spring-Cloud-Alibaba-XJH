package com.xjh.book.nacos.controller;

import com.xjh.book.nacos.service.IHelloService;
import com.xjh.book.nacos.service.ILoveService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xujiahui
 * @create 2021/8/11 23:32
 * @Description
 */
@RestController
public class HelloController {

    @Reference
    private IHelloService helloService;

    @Reference
    private ILoveService loveService;

    @GetMapping("/say")
    public String sayHello() {
        return helloService.sayHello("xjh");
    }

    @GetMapping("/love")
    public String sayLove() {
        return loveService.loveYou("a");
    }

}
