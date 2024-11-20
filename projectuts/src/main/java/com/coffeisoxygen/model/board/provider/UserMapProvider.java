package com.coffeisoxygen.model.board.provider;

import java.util.Map;

import com.coffeisoxygen.model.board.Board;

public class UserMapProvider implements MapProvider {
    private final Map<String, Board> userMaps;
    private final String mapName;

    public UserMapProvider(Map<String, Board> userMaps, String mapName) {
        this.userMaps = userMaps;
        this.mapName = mapName;
    }

    @Override
    public Board loadMap() {
        return userMaps.get(mapName);
    }
}