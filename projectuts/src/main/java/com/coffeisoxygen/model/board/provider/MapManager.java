package com.coffeisoxygen.model.board.provider;

import com.coffeisoxygen.model.board.Board;

public class MapManager {
    private MapProvider mapProvider;

    public MapManager(MapProvider mapProvider) {
        this.mapProvider = mapProvider;
    }

    public Board loadMap() {
        return mapProvider.loadMap();
    }

    public void setMapProvider(MapProvider mapProvider) {
        this.mapProvider = mapProvider;
    }
}