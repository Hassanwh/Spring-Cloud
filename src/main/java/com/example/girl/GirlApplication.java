package com.example.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author:    wh
 * @since:     5.0
 * 统一@Configuration+@EnableAutoConfiguration+@ComponentScan
 */
@SpringBootApplication
public class GirlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GirlApplication.class, args);
	}
}
