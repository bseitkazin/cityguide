package com.my.app.guide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class CityGuideApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityGuideApplication.class, args);
	}

}
