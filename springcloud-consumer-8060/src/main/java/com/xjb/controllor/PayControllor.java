package com.xjb.controllor;

import bean.CommonResult;
import bean.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xjb
 * @create 2021-05-15-10:43
 */
@RestController
public class PayControllor {

    private String url = "http://CLOUD-PAYMENT-SERVICE-1";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping( value = "/insert")
    public CommonResult<Payment> addPayment(int order_identifier) {
        CommonResult result = restTemplate.postForObject(url+"/insert", order_identifier,CommonResult.class);
        return  result;
    }

    @GetMapping("/get")
    public CommonResult<Payment> getPaymentById(int order_id) {
        return restTemplate.getForObject("http://localhost:8081/get?order_id="+order_id,CommonResult.class,order_id);
    }

}
