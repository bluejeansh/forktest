package edu.multi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForktestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForktestApplication.class, args);
		System.out.println("forktest 원격에서 수정합니다");
	}

}
