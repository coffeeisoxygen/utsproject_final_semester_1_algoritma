package com.coffeisoxygen.model.board.provider;

import com.coffeisoxygen.model.board.Board;

public class MapManager {
    private MapProvider mapProvider;
    private Board currentBoard;

    public MapManager(MapProvider mapProvider) {
        this.mapProvider = mapProvider;
        this.currentBoard = mapProvider.loadMap();
    }

    public Board loadMap() {
        this.currentBoard = mapProvider.loadMap();
        return currentBoard;
    }

    public void setMapProvider(MapProvider mapProvider) {
        this.mapProvider = mapProvider;
        this.currentBoard = mapProvider.loadMap();
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public void saveMap(Board board) {
        // TODO : Implement saving logic here, e.g., save to a file or database
        this.currentBoard = board;
    }

    public Board resetMap() {
        this.currentBoard = mapProvider.loadMap();
        return currentBoard;
    }
}