package com.wugf.config.feign;

import feign.Feign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.web.WebMvcRegistrations;
import org.springframework.boot.autoconfigure.web.WebMvcRegistrationsAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


/**
 * Created by acer on 2017-10-29.
 */
@Configuration
@ConditionalOnClass({Feign.class})
public class FeignMappingDefaultConfig {

    @Bean
    public WebMvcRegistrations feignWebRegistrations() {
        return new WebMvcRegistrationsAdapter() {
            @Override
            public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
                return new FeignFilterRequestMappingHandlerMapping();
            }
        };
    }

    private static class FeignFilterRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

        /**
         * 解决 服务消费端解析 @FeignClient定义的路由
         * @FeignClient 定义的路由不能在服务消费端被解析，解析了就会直接调用本地而不调用远程服务了
         * @param beanType
         * @return
         */
        @Override
        protected boolean isHandler(Class<?> beanType) {
            return super.isHandler(beanType) && ((AnnotationUtils.findAnnotation(beanType, RestController.class) != null) || (AnnotationUtils.findAnnotation(beanType, Controller.class) != null));
        }
    }
}
