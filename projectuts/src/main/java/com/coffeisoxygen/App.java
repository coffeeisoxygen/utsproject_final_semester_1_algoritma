package com.coffeisoxygen;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.model.board.Tilemodel;
import com.coffeisoxygen.model.board.provider.MapManager;
import com.coffeisoxygen.model.board.provider.MapProvider;
import com.coffeisoxygen.model.board.provider.NewMapProvider;
import com.coffeisoxygen.model.board.provider.SystemMapProvider;
import com.coffeisoxygen.util.Coordinate;

public class App {
    public static void main(String[] args) {
        // Inject SystemMapProvider into MapManager
        MapProvider systemMapProvider = new SystemMapProvider();
        MapManager mapManager = new MapManager(systemMapProvider);
        Board systemBoard = mapManager.loadMap();

        // Display the system map
        System.out.println("System map loaded with tiles:");
        for (Tilemodel tile : systemBoard.getTiles().values()) {
            System.out.println(tile);
        }

        // Inject NewMapProvider into MapManager
        MapProvider newMapProvider = new NewMapProvider(new Coordinate(20, 20));
        mapManager.setMapProvider(newMapProvider);
        Board newBoard = mapManager.loadMap();

        // Display the new map
        System.out.println("New map loaded with tiles:");
        for (Tilemodel tile : newBoard.getTiles().values()) {
            System.out.println(tile);
        }
    }
}