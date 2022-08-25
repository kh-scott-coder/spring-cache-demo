package dev.scott;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringCachingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCachingServiceApplication.class, args);
	}

}