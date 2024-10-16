package com.ramjay.flyvevej;

import com.ramjay.flyvevej.repositories.BogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyvevejApplication implements CommandLineRunner {

	private final BogRepository bogRepository;

    public FlyvevejApplication(BogRepository bogRepository) {
        this.bogRepository = bogRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(FlyvevejApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bogRepository.findAll()
				.forEach(bog -> System.out.println(bog.toString()));
	}
}
