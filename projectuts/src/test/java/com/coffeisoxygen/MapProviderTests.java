package com.coffeisoxygen;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.model.board.provider.NewMapProvider;
import com.coffeisoxygen.util.Coordinate;

public class MapProviderTests {
    @Test
    public void testLoadMap() {
        Coordinate dimensions = new Coordinate(20, 20);
        NewMapProvider newMapProvider = new NewMapProvider(dimensions);
        Board board = newMapProvider.loadMap();

        assertEquals(400, board.getTiles().size());
    }
}