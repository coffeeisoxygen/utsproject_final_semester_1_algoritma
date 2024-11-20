package com.coffeisoxygen;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.model.board.provider.*;

public class SystemMapProviderTest {
    @Test
    public void testLoadMap() {
        SystemMapProvider systemMapProvider = new SystemMapProvider();
        MapManager mapManager = new MapManager(systemMapProvider);
        Board board = mapManager.loadMap();

        assertNotNull(board);
        assertNotNull(board.getTiles());
    }
}