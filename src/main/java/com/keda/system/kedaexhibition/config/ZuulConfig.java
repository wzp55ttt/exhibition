package com.keda.system.kedaexhibition.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author yuzhikuan
 * @date 2020/08/14
 **/
@Configuration
public class ZuulConfig {

    @Bean
    public FilterRegistrationBean corsFilter() {
        //初始化cors配置源对象
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        //初始化cors配置对象
        final CorsConfiguration config = new CorsConfiguration();
        //允许携带cookie
        config.setAllowCredentials(true);
        //允许跨域的域名，如果要携带cookie，不能写*。*:代表所有域名都可以跨域访问
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        //代表所有的请求方法：GET POST PUT Delete...
        config.addAllowedMethod("*");
        config.setMaxAge(18000L);
        source.registerCorsConfiguration("/**", config);
        CorsFilter corsFilter = new CorsFilter(source);
        FilterRegistrationBean bean = new FilterRegistrationBean(corsFilter);
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
    }
}
