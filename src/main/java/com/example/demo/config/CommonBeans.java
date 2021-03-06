package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Configuration
public class CommonBeans {
	@Bean
	public Gson gson() {
		return new GsonBuilder().serializeNulls().create();
	}
}
