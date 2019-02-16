package com.azad.securityforlogin;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/","/login","/public/**").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")

 //                only ADMIN role will go to the all page under "admin" folder

                .antMatchers("/user/**").hasAnyRole("USER","ADMIN")

// only USER and ADMIN role will go to the all page under user folder

                .antMatchers("/user/**").hasRole("USER")
                .and()
                .formLogin().loginPage("/login").permitAll()
                .and().logout().permitAll();
    }

    public UserDetailsService userDetailsService(){
        UserDetails user= User.withDefaultPasswordEncoder().username("user")
                .password("1234")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);  //use for inmemory
    }
}
