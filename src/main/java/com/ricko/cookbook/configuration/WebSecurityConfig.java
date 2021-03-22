package com.ricko.cookbook.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

//@EnableWebSecurity
@Configuration
public class WebSecurityConfig  { //extends WebSecurityConfigurerAdapter

/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
//        http.requiresChannel().requiresSecure();
    }*/

    /*//todo TEMP
    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http.authorizeExchange().anyExchange().permitAll();
        return http.build();
    }*/


}
