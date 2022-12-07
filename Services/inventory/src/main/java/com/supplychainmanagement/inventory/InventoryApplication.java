package com.supplychainmanagement.inventory;

import com.supplychainmanagement.inventory.util.DataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableEurekaClient
@SpringBootApplication
@EnableWebMvc
@CrossOrigin(origins = "*")
public class InventoryApplication {

	public static void main(String[] args) {
		DataLoader dl = new DataLoader();
		SpringApplication.run(InventoryApplication.class, args);
		dl.loadData();
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
