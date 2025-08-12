package github.zmz.mybatis.config;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {

    // 注册自定义拦截器
    @Bean
    public Interceptor customPageInterceptor() {
        return new CustomPageInterceptor();
    }

}