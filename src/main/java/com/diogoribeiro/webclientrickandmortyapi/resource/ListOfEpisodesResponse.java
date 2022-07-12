package com.diogoribeiro.webclientrickandmortyapi.resource;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ListOfEpisodesResponse {

    private List<EpisodeResponde> results;
}
