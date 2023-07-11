package com.collaboration.rtc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
public class MvcConfig {
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/homepage").setViewName("homepage");
		registry.addViewController("/").setViewName("homepage");
		registry.addViewController("/admin").setViewName("adminpage");
		registry.addViewController("/login").setViewName("login");
	}

}
