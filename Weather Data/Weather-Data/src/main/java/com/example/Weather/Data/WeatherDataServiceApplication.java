package com.example.Weather.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WeatherDataServiceApplication {

  public static void main(String[] args) {

    SpringApplication.run(WeatherDataServiceApplication.class, args);
  }

}
