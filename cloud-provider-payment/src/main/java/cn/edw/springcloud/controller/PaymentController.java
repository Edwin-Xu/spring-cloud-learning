package cn.edw.springcloud.controller;

import cn.edw.springcloud.domain.common.Response;
import cn.edw.springcloud.domain.po.Payment;
import cn.edw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

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
}
