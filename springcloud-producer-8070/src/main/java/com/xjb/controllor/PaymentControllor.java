package com.xjb.controllor;



import bean.CommonResult;
import bean.Payment;
import com.xjb.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping( value = "/insert")
    public CommonResult<Payment> addPayment(@RequestBody int order_identifier) {
        return paymentService.addPayment(order_identifier);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") int order_id) {
        return paymentService.getPaymentById(order_id);
    }

    @GetMapping("/discoveryClient")
    public String get_discovery_info(){
        List<String> services = discoveryClient.getServices();
        for (String service: services) {
            System.out.println(service);
        }
        List<ServiceInstance>  instances= discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE-1");
        for (ServiceInstance element : instances) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());;
        }
        return "success";
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
