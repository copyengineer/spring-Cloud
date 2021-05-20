package com.xjb.service;

import bean.CommonResult;
import bean.Payment;

/**
 * @author xjb
 * @create 2021-05-14-21:06
 */
public interface PaymentService {

    public CommonResult<Payment> addPayment(int order_identifier);//插入订单

    public CommonResult<Payment> getPaymentById(int order_id);//通过id获取订单

}
