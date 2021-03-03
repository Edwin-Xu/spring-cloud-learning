package cn.edw.springcloud.controller;

import cn.edw.springcloud.domain.common.Response;
import cn.edw.springcloud.domain.po.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;


/**
 * @author Edwin Xu
 * @date 3/3/2021 9:37 PM.
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {
    private static final String PAYMENT_URL = "http://localhost:8080";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/payment/create")
    public Response create(@RequestBody Payment payment){
        // POST: URL, Body, Response Class
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,Response.class);
    }

    @GetMapping("/payment/get")
    public Response getPaymentByID(@PathParam("id") int id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get?id="+id,Response.class);
    }

}
