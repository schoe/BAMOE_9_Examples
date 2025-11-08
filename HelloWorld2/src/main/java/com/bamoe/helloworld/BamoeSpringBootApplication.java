package com.bamoe.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "org.kie.**", "com.bamoe.helloworld.**", "org.drools.**",
    "org.jbpm.**" })
public class BamoeSpringBootApplication {
  public static void main(String[] args) {
    SpringApplication.run(BamoeSpringBootApplication.class, args);
  }
}