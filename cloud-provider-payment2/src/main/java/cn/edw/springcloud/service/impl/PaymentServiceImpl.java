package cn.edw.springcloud.service.impl;

import cn.edw.springcloud.dao.PaymentDao;
import cn.edw.springcloud.domain.common.Response;
import cn.edw.springcloud.domain.po.Payment;
import cn.edw.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Edwin Xu
 * @date 3/3/2021 5:43 PM.
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    // not @Autowire
    @Resource
    private PaymentDao paymentDao;

    @Value("${server.port}")
    private int serverPort;

    @Override
    public Response create(Payment payment) {
        try {
            return Response.buildSuccess("ok,server port="+serverPort,paymentDao.create(payment));
        }catch (Exception e){
            e.printStackTrace();
            return Response.buildFailure(e.toString());
        }
    }

    @Override
    public Response getPaymentById(int id) {
        try {
            return Response.buildSuccess("ok,server port="+serverPort, paymentDao.getPaymentById(id));
        }catch (Exception e){
            e.printStackTrace();
            return Response.buildFailure(e.toString());
        }
    }
}
