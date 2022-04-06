package de.neuefisch.w3rickandmorty.api;

import de.neuefisch.w3rickandmorty.model.RMCharacterInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RMApiService {

    private final WebClient webClient;

    @Autowired
    public RMApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public RMCharacterInfo getCharacters (){
        RMCharacterInfo characters = webClient.get()
                .uri("/character")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(RMCharacterInfo.class)
                .block()
                .getBody();

        return characters;
    }

}
