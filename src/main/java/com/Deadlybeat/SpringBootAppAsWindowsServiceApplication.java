package com.Deadlybeat;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableScheduling
public class SpringBootAppAsWindowsServiceApplication {

	@GetMapping("/status")
	public String getStatus() {
		return "Application is running...!!";
	}
	
	//scheduler to check every 50 sec=5000milisec
	@Scheduled(fixedDelay = 50000)
	public void print() {
		System.out.println("Current time:-"+new Date());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppAsWindowsServiceApplication.class, args);
	}

}
