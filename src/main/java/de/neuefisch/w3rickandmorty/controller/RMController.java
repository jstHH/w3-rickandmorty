package de.neuefisch.w3rickandmorty.controller;

import de.neuefisch.w3rickandmorty.model.RMCharacter;
import de.neuefisch.w3rickandmorty.service.RMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("RM")
public class RMController {
    private final RMService rmService;

    @Autowired
    public RMController(RMService rmService) {
        this.rmService = rmService;
    }

    @GetMapping
    public List<RMCharacter> getCharacters (){
        return rmService.getCharacters();

    }
}
