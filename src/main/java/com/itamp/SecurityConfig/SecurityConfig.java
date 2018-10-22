/*package com.itamp.SecurityConfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterBefore(new Corsfilter(), ChannelProcessingFilter.class);
		http.authorizeRequests().antMatchers("/").permitAll()
		.anyRequest().fullyAuthenticated()
		.and().httpBasic().and().csrf().disable();
		
	}
	
  } 
  */

