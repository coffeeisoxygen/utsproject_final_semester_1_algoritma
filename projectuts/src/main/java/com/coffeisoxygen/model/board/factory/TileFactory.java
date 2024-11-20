package com.coffeisoxygen.model.board.factory;

import com.coffeisoxygen.model.board.TileCategory;
import com.coffeisoxygen.model.board.Tilemodel;
import com.coffeisoxygen.util.Coordinate;

public class TileFactory {
    public static Tilemodel createTile(String name, TileCategory category, int x, int y) {
        return new Tilemodel(name, category, x, y);
    }

    public static Tilemodel createTile(String name, TileCategory category, Coordinate coordinate) {
        return new Tilemodel(name, category, coordinate.getX(), coordinate.getY());
    }
}