package com.rancho_smart.ms_conexiones_externas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsConexionesExternasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConexionesExternasApplication.class, args);
	}

}
