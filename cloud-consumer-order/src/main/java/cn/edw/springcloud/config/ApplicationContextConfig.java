package cn.edw.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Edwin Xu
 * @date 3/3/2021 9:43 PM.
 * 获取RestTemplate模板类，用户模拟Http掉员工
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    // 负载均衡
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
