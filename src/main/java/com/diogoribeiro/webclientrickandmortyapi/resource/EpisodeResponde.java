package com.diogoribeiro.webclientrickandmortyapi.resource;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EpisodeResponde {

    private String id;
    private String name;
    private String air_date;
    private String episode;
    private List<String> characters;
    private String url;
}
