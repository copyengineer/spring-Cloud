package com.xjb.controllor;



import bean.CommonResult;
import bean.Payment;
import com.xjb.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author xjb
 * @create 2021-05-14-21:10
 */
@RestController
public class PaymentControllor {
    @Value("${server.port}")
    String port;

    @Autowired
    private PaymentService paymentService;

    @PostMapping( value = "/insert")
    public CommonResult<Payment> addPayment(@RequestBody int order_identifier) {
        return paymentService.addPayment(order_identifier);
    }

    @GetMapping("/get")
    public CommonResult<Payment> getPaymentById(int order_id) {
        System.out.println(paymentService.getPaymentById(order_id));
        System.out.println(order_id);
        return paymentService.getPaymentById(order_id);
    }

    @GetMapping("/timeout")
    public String timeout_openfeign(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }

}
