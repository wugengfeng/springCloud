package com.wugf.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * zuul路由前过滤器
 */
@Component
public class PreFilter extends ZuulFilter{
    /**
     * 过滤器类型
     * pre：可以在请求被路由之前调用
     * route：在路由请求时候被调用
     * post：在route和error过滤器之后被调用
     * error：处理请求时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器优先级
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否要执行该过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 业务逻辑
     * @return
     */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        System.out.println(String.format("method:%s, url:%s", httpServletRequest.getMethod(),
                httpServletRequest.getRequestURL().toString()));
        //httpServletRequest.getMethod() 获取请求方式 GET/POST
        //httpServletRequest.getRequestURL() 获取前端请求路径

        return null;
    }
}
