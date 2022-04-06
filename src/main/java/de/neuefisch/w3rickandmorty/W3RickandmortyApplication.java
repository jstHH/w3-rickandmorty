package de.neuefisch.w3rickandmorty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class W3RickandmortyApplication {

    public static void main(String[] args) {
        SpringApplication.run(W3RickandmortyApplication.class, args);
    }


    @Bean
    public WebClient getWebclient() {
        return WebClient.create("https://rickandmortyapi.com/api");
    }

}

