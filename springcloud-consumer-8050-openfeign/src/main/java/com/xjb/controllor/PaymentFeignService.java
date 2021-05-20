package com.xjb.controllor;

import bean.CommonResult;
import bean.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xjb
 * @create 2021-05-16-22:31
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE-1")
public interface PaymentFeignService {

    @GetMapping(value = "/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id")long id);

    @GetMapping(value = "/timeout")
    String Timeout();
}
