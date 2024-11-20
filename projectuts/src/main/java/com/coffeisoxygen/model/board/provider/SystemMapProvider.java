package com.coffeisoxygen.model.board.provider;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.model.board.TileCategory;
import com.coffeisoxygen.model.board.factory.TileFactory;

public class SystemMapProvider implements MapProvider {
    @Override
    public Board loadMap() {
        Board board = new Board();
        initializeSpecialTiles(board);
        initializeNormalTiles(board);
        return board;
    }

    private void initializeSpecialTiles(Board board) {
        // Place special tiles on the board using TileFactory
        board.addTile(TileFactory.createTile("S", TileCategory.START, 0, 0));
        board.addTile(TileFactory.createTile("E", TileCategory.END, 11, 5));
        board.addTile(TileFactory.createTile("D", TileCategory.DANGER, 5, 3));
        board.addTile(TileFactory.createTile("R", TileCategory.REST, 6, 3));
    }

    private void initializeNormalTiles(Board board) {
        // Initialize normal tiles as needed
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 5; y++) {
                String name = "N" + x + "_" + y;
                board.addTile(TileFactory.createTile(name, TileCategory.NORMAL, x, y));
            }
        }
    }
}