package com.coffeisoxygen.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.ui.maploader.PageLoadSystemMap;

public class MapGame {
    public static void start(Board board) {
        JFrame frame = new JFrame("Map Game");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(PageLoadSystemMap.displayBoard(board), BorderLayout.CENTER);
        frame.setVisible(true);
        // Implement the game logic using the board
    }
}