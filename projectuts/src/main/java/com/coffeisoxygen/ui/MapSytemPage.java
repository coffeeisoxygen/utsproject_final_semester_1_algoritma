package com.coffeisoxygen.ui;

import javax.swing.JFrame;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.model.board.provider.SystemMapProvider;

public class MapSytemPage {
    public static void start() {
        JFrame frame = new JFrame("System Map");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        SystemMapProvider systemMapProvider = new SystemMapProvider();
        Board board = systemMapProvider.loadMap();
        // Display the board
    }
}