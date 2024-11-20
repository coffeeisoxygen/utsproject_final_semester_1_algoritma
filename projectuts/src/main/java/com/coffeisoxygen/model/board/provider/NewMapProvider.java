package com.coffeisoxygen.model.board.provider;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.model.board.TileCategory;
import com.coffeisoxygen.model.board.factory.TileFactory;
import com.coffeisoxygen.util.Coordinate;

public class NewMapProvider implements MapProvider {
    private final Coordinate dimensions;

    public NewMapProvider(Coordinate dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public Board loadMap() {
        Board board = new Board();
        for (int x = 0; x < dimensions.getX(); x++) {
            for (int y = 0; y < dimensions.getY(); y++) {
                String name = "Empty" + x + "_" + y;
                board.addTile(TileFactory.createTile(name, TileCategory.NORMAL, x, y));
            }
        }
        return board;
    }
}