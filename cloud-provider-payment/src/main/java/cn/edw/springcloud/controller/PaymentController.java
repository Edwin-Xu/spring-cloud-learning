package cn.edw.springcloud.controller;

import cn.edw.springcloud.domain.common.Response;
import cn.edw.springcloud.domain.po.Payment;
import cn.edw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @author Edwin Xu
 * @date 3/3/2021 5:46 PM.
 */
@RestController()
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public Response create(@RequestBody Payment payment){
        return paymentService.create(payment);
    }

    @GetMapping("/get")
    public Response getPaymentById(@PathParam("id") int id){
        return paymentService.getPaymentById(id);
    }

    @Resource
    private org.springframework.cloud.client.discovery.DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public Response discovery(){
        return Response.buildSuccess("ok",discoveryClient);
    }
}
