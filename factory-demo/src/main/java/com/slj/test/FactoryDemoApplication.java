package com.slj.test;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author suliujie
 * @since 2022-05-31 9:22
 */
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.slj.test")
public class FactoryDemoApplication {

  public static void main(String[] args) {

    SpringApplication.run(FactoryDemoApplication.class, args);
  }
}
