package com.xjh.book.dubbo;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;

/**
 * @author xujiahui
 * @create 2021/7/25 17:05
 * @Description
 */
@RestController
public class HelloController {

//    @Reference(url = "zookeeper://192.168.137.133:2181/com.xjh.book.dubbo.IHelloService")
    private IHelloService iHelloService;

    private static final ThreadLocal<DateFormat> local = new ThreadLocal<>(){
        @Override
        protected DateFormat initialValue() {
            return super.initialValue();
        }
    };

    @RequestMapping("/say")
    public String sayHello() {
        System.out.println("Lin Daiyu 林黛玉");
        return iHelloService.sayHello("Lin Daiyu 林黛玉");
    }
}
