package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

import static org.springframework.security.authorization.AuthenticatedReactiveAuthorizationManager.authenticated;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource datasource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        auth.jdbcAuthentication().dataSource(datasource)
                .passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests()
//                .anyRequest().authenticated()
//                .mvcMatchers("/admin/*").hasRole("admin")
//                .mvcMatchers("/about", "help").permitAll()
//                .and()
//                .formLogin()
////                .failureUrl("/authentication/login?failed")
////                .loginPage("/authentication/login")
////                .loginProcessingUrl("/authentication/login/process")
//                .and()
//                .csrf().disable();
////        http.authorizeRequests()
////                .mvcMatchers("/admin/*").hasRole("/ADMIN")
////                .mvcMatchers("/about", "help").permitAll()
////                .anyRequest().authenticated()
////                .
//
//        super.configure(http);
        /**
         * 下面是更新版
         *
         */
        http.authorizeRequests()
                .mvcMatchers("/admin/*").hasRole("ADMIN")
                .mvcMatchers("/","/login.html").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login.html")
                .and()
                .csrf().disable();
    }



}

