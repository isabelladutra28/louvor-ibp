package com.project.ibp.louvoribp.external.configuration.webmvc;

import com.project.ibp.louvoribp.external.configuration.internationalization.Internationalization;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer, Internationalization {
    @Override
    public String getMessage(String code, Object... args) {
        return null;
    }
}
