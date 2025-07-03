package org.wporta.chronix_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UriComponentsBuilder;

@Configuration
public class AppConfig {

    @Bean
    public UriComponentsBuilder uriBuilder() {
        return UriComponentsBuilder.newInstance();
    }
}