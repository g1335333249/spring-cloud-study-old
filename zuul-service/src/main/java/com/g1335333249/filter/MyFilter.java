package com.g1335333249.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >> %s", request.getMethod(),
                request.getRequestURL().toString()));
        String authorization = request.getHeader("Authorization");
        System.out.println(authorization);
        ctx.addZuulRequestHeader("Authorization",authorization);
        if (authorization == null) {
            log.warn("Authorization is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("Authorization is empty");
            } catch (Exception e) {
                e.printStackTrace();
                log.error(e.getMessage());
                return null;
            }
        }
        return null;
    }
}
