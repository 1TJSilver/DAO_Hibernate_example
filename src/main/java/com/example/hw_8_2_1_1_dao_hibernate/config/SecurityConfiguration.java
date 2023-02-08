package com.example.hw_8_2_1_1_dao_hibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .and()
                .authorizeRequests().antMatchers("/by-city").permitAll()
                .and()
                .authorizeRequests().antMatchers("/by-lessAge").hasAuthority("read")
                .and()
                .authorizeRequests().antMatchers("/by-name-surname").hasAuthority("read");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Boozooka").password("{noop}qwertyuiop").authorities("read")
                .and()
                .withUser("n1rds").password("{noop}krovosisa");
    }
}
