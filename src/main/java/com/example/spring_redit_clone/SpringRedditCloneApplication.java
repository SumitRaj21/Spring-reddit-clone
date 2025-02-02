package com.example.spring_redit_clone;



import com.example.spring_redit_clone.config.OpenAPIConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(OpenAPIConfiguration.class)
public class SpringRedditCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.example.spring_redit_clone.SpringRedditCloneApplication.class, args);
	}

}
