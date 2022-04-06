package de.neuefisch.w3rickandmorty.service;

import de.neuefisch.w3rickandmorty.api.RMApiService;
import de.neuefisch.w3rickandmorty.model.RMCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RMService {

    private final RMApiService rmApiService;


    @Autowired
    public RMService(RMApiService rmApiService) {
        this.rmApiService = rmApiService;
    }

    public List<RMCharacter> getCharacters() {
        return rmApiService.getCharacters().getResults();
    }
}
