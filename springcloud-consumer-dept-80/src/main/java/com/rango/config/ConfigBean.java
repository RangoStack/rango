package com.rango.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 这个类相当于applicationContext.xml
 * <bean id="" class=""/>
 * 注册得到bean
 * 前面有 配置文件组件扫描 + 注解
 * 这里没有 故使用使用这个方式
 *
 * @Configuration + @Bean 注册bean
 *
 */

@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
