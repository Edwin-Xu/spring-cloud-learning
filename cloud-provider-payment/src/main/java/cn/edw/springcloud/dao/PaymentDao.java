package cn.edw.springcloud.dao;

import cn.edw.springcloud.domain.po.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Edwin Xu
 * @date 3/3/2021 5:23 PM.
 * //@Resource
 * 使用Mapper而不是Resource
 * Service中的DAO才是@Resource而不是Autowire
 */

@Mapper
public interface PaymentDao {
    int create(@Param("payment") Payment payment);

    Payment getPaymentById(@Param("id") int id);

}
