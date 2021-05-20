package com.xjb.controllor;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xjb.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xjb
 * @create 2021-05-17-18:45
 */
@RestController
public class paymentControllor {

    @Autowired
    private PaymentService service;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") int id) {
        return service.pament_Ok(id);
    }

    @HystrixCommand(fallbackMethod = "fallbackMethod",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500"),//设置超时时间
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//开启熔断功能
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value="10"),//10次请求
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//10秒睡眠窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//10秒内10次请求错误率达到60%启动熔断
    })
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") int id) throws InterruptedException {
        return service.pament_NotOk(id);
    }

    private String fallbackMethod(int id){
        return "端口：" + 8040 + "服务降级aa";
    }
}
