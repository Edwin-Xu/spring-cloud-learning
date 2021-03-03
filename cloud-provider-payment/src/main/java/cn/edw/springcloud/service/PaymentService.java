package cn.edw.springcloud.service;

import cn.edw.springcloud.domain.common.Response;
import cn.edw.springcloud.domain.po.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 3/3/2021 5:42 PM.
 */

public interface PaymentService {
    Response create(Payment payment);

    Response getPaymentById( int id);
}
