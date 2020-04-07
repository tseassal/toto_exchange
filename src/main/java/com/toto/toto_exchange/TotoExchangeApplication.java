package com.toto.toto_exchange;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class TotoExchangeApplication /*extends WebSecurityConfigurerAdapter*/ {


//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		//http.authorizeRequests().anyRequest().permitAll();
//	}

	public static void main(String[] args) {
		//ApplicationContext
		SpringApplication.run(TotoExchangeApplication.class, args);
	}

}
