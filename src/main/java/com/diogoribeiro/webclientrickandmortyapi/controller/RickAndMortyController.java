package com.diogoribeiro.webclientrickandmortyapi.controller;

import com.diogoribeiro.webclientrickandmortyapi.client.RickAndMortyClient;
import com.diogoribeiro.webclientrickandmortyapi.resource.CharacterResponse;
import com.diogoribeiro.webclientrickandmortyapi.resource.EpisodeResponde;
import com.diogoribeiro.webclientrickandmortyapi.resource.ListOfEpisodesResponse;
import com.diogoribeiro.webclientrickandmortyapi.resource.LocationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
public class RickAndMortyController {

    @Autowired
    RickAndMortyClient rickAndMortyClient;

    @GetMapping("/character/{id}")
    public Mono<CharacterResponse> getCharacterById(@PathVariable String id){
        return rickAndMortyClient.findCharacterById(id);
    }

    @GetMapping("/location/{id}")
    public Mono<LocationResponse> getLocationById(@PathVariable String id){
        return rickAndMortyClient.findLocationById(id);
    }

    @GetMapping("/episode/{id}")
    public Mono<EpisodeResponde> getAnEpisodeById(@PathVariable String id){
        return rickAndMortyClient.findAnEpisodeById(id);
    }

    @GetMapping("/episodes")
    public Flux<ListOfEpisodesResponse> getAllEpisodes(){
        return rickAndMortyClient.getAllEpisodes();
    }

}
