package com.coffeisoxygen.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import com.coffeisoxygen.model.board.Board;

public class PageMapPreview {
    public static void start(Board board) {
        JFrame frame = new JFrame("Preview Map");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

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

    private static JPanel displayBoard(Board board) {
        // Implement the method to display the board
        JPanel panel = new JPanel();
        // Add components to display the board
        return panel;
    }
}