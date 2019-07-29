package cn.wmyskxz.springboot;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 自定义filter
 */
@Configuration
public class WebConfiguration {
//    @Bean
//    public RemotelpFilter remotelpFilter(){
//        return new RemotelpFilter();
//    }

    @Bean
    public FilterRegistrationBean testFilterRegistration(){
      FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
      filterRegistrationBean.setFilter(new MyFilter());
      filterRegistrationBean.addUrlPatterns("/*");
      filterRegistrationBean.addInitParameter("paramName","paramValue");
      filterRegistrationBean.setName("MyFilter");
      filterRegistrationBean.setOrder(1);
      return filterRegistrationBean;
    }

    public class MyFilter implements Filter{

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest request= (HttpServletRequest) servletRequest;
            request.getRequestURI();
            filterChain.doFilter(servletRequest,servletResponse);
        }

        @Override
        public void destroy() {

        }
    }
}
