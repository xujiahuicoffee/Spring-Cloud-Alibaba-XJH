package com.xjh.book.nacos.service.impl;

import com.xjh.book.nacos.service.ILoveService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xujiahui
 * @create 2021/8/12 17:43
 * @Description
 */
@Service
public class LoveServiceImpl implements ILoveService {
    @Override
    public String loveYou(String name) {
        return "I Love You, Xi Yan";
    }
}
