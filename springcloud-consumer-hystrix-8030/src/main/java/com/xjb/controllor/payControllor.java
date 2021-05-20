package com.xjb.controllor;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xjb.service.payService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xjb
 * @create 2021-05-17-20:44
 */
@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class payControllor {

    @Autowired
    private payService service;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id)
    {
        String result = service.paymentInfo_OK(id);
        return result;
    }

    /*@HystrixCommand(fallbackMethod = "errorMethod",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })*/
    //@HystrixCommand//不指定兜底方法，使用默认的
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id)
    {
        String result = service.paymentInfo_TimeOut(id);
        return result;
    }

   /* private String errorMethod(@PathVariable Integer id){
        return "消费端服务降级：8030";
    }

    private String defaultFallback(){
        return "默认兜底方法：消费端服务降级：8030";
    }*/
}

