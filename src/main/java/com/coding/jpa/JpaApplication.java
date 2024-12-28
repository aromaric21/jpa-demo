package com.coding.jpa;


import com.coding.jpa.models.Author;
import com.coding.jpa.models.Video;
import com.coding.jpa.repositories.AuthorRepository;
import com.coding.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository
	){
		return args -> {

			/*var author = Author.builder()
					.firstName("alibou")
					.lastName("alibou")
					.age(34)
					.email("conatact@aliboucoding.com")
					.build();
			repository.save(author); */

			var video = Video.builder()
					.name("ABC")
					.length(5)
					.size(10)
					.build();
			videoRepository.save(video);
		};
	}
}