package com.coffeisoxygen.ui.maploader;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.ui.LandingPage;
import com.coffeisoxygen.ui.MapGame;

public class PageLoadSavedMap {
    public static void start() {
        JFrame frame = new JFrame("Load Map");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        Board board = loadSavedMap();
        // Display the board (implement displayBoard method)
        JPanel boardPanel = displayBoard(board);
        frame.add(boardPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton startButton = new JButton("Start Game");
        JButton backButton = new JButton("Back to Menu");
        buttonPanel.add(startButton);
        buttonPanel.add(backButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        startButton.addActionListener(e -> {
            frame.dispose();
            MapGame.start(board);
        });

        backButton.addActionListener(e -> {
            frame.dispose();
            LandingPage.start();
        });

        frame.setVisible(true);
    }

    private static Board loadSavedMap() {
        // Implement the method to load a saved map
        return new Board();
    }

    private static JPanel displayBoard(Board board) {
        // Implement the method to display the board
        JPanel panel = new JPanel();
        // Add components to display the board
        return panel;
    }
}