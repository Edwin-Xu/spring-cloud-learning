package cn.edw.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 3/3/2021 9:43 PM.
 * 获取RestTemplate模板类，用户模拟Http掉员工
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
