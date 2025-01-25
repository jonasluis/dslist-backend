package com.jonasluis.dslist.dto;

import com.jonasluis.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList list) {
        name = list.getName();
        id = list.getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
