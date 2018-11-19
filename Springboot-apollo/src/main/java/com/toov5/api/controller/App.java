package com.toov5.api.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;


@EnableApolloConfig
@SpringBootApplication
public class App {
  public static void main(String[] args) {
	SpringApplication.run(App.class, args);
}
}
