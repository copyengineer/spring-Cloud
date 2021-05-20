package com.xjb.dao.impl;

import bean.Payment;
import com.xjb.dao.PaymentDao;
import org.springframework.stereotype.Repository;

/**
 * @author xjb
 * @create 2021-05-14-20:58
 */
@Repository
public class PaymentImpl implements PaymentDao {

    @Override
    public int addPayment(int order_identifier) {
        return 0;
    }

    @Override
    public Payment getPaymentById(int order_id) {
        return null;
    }
}
