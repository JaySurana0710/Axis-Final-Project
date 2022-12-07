package com.supplychainmanagment.inventory;


import com.supplychainmanagment.inventory.util.DataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class InventoryserviceApplication {

	public static void main(String[] args) {
		//DataLoader dl = new DataLoader();
		SpringApplication.run(InventoryserviceApplication.class, args);
		//dl.loadData();

	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
