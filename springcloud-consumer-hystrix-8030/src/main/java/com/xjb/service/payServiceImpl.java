package com.xjb.service;

import org.springframework.stereotype.Component;

/**
 * @author xjb
 * @create 2021-05-18-19:11
 */
@Component
public class payServiceImpl implements payService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "ok方法降级处理了";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "timeout方法降级处理了";
    }
}
