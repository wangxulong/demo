package com.example.demo.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by liyunwen on 2017/9/24.
 */
@Component
public class ServletContainer implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8888);
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/error/404.html"));
        container.setSessionTimeout(10, TimeUnit.SECONDS);
    }
}
