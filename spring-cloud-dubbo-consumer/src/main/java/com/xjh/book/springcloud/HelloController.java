package com.xjh.book.springcloud;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xujiahui
 * @create 2021/7/26 10:35
 * @Description
 */
@RestController
public class HelloController {

    @DubboReference
    private IHelloService iHelloService;

    @GetMapping("/say")
    public String sayHello() {
        return iHelloService.sayHello("xixi");

    }

}
