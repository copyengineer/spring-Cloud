package com.xjb.dao;

import bean.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

/**
 * @author xjb
 * @create 2021-05-14-20:55
 */
@Mapper
public interface PaymentDao {

    @Insert("insert into orders(order_identifier) values(#{order_identifier})")
    public int addPayment(int order_identifier);//插入订单

    @ResultType(Payment.class)
    @Select({"select * from orders where order_id = #{order_id}"})
    public Payment getPaymentById(int order_id);//通过id获取订单

}
