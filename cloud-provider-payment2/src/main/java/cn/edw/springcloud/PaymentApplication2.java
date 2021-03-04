package cn.edw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Edwin Xu
 * @date 3/3/2021 5:08 PM.
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication2.class,args);
    }
}
