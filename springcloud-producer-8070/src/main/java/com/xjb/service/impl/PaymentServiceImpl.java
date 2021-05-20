package com.xjb.service.impl;

import bean.CommonResult;
import bean.Payment;
import com.xjb.dao.PaymentDao;
import com.xjb.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

/**
 * @author xjb
 * @create 2021-05-14-21:07
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Qualifier("paymentDao")
    @Autowired
    private PaymentDao paymentDao;

    @Autowired
    private DataSource dataSource;

    @Override
    public CommonResult<Payment> addPayment(int order_identifier) {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource);
        int i = paymentDao.addPayment(order_identifier);
        if(i > 0){
            return new CommonResult<Payment>(200,"添加订单成功,端口为:"+8070,new Payment(i,order_identifier));
        }else{
            return new CommonResult<Payment>(400,"添加订单失败,端口为:"+8070,new Payment(i,order_identifier));
        }
    }

    @Override
    public CommonResult<Payment> getPaymentById(int order_id) {
        Payment pm = paymentDao.getPaymentById(order_id);
        if(pm != null){
            return new CommonResult<Payment>(200,"查询成功",pm);
        }
        return new CommonResult<Payment>(400,"查询失败", pm);
    }
}
