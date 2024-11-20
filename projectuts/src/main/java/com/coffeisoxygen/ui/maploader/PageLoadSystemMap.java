package com.coffeisoxygen.ui.maploader;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.model.board.Tilemodel;
import com.coffeisoxygen.model.board.provider.MapManager;
import com.coffeisoxygen.model.board.provider.SystemMapProvider;
import com.coffeisoxygen.ui.LandingPage;
import com.coffeisoxygen.ui.MapGame;

public class PageLoadSystemMap {
    public static void start() {
        JFrame frame = new JFrame("System Map");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        MapManager mapManager = new MapManager(new SystemMapProvider());
        Board board = mapManager.loadMap();
        // Display the board
        JPanel boardPanel = displayBoard(board);
        frame.add(boardPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton startButton = new JButton("Start Game");
        JButton backButton = new JButton("Back to Menu");
        JButton resetButton = new JButton("Reset Map");
        buttonPanel.add(startButton);
        buttonPanel.add(backButton);
        buttonPanel.add(resetButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        startButton.addActionListener(e -> {
            frame.dispose();
            MapGame.start(board);
        });

        backButton.addActionListener(e -> {
            frame.dispose();
            LandingPage.start();
        });

        resetButton.addActionListener(e -> {
            Board resetBoard = mapManager.resetMap();
            frame.remove(boardPanel);
            JPanel newBoardPanel = displayBoard(resetBoard);
            frame.add(newBoardPanel, BorderLayout.CENTER);
            frame.revalidate();
            frame.repaint();
        });

        frame.setVisible(true);
    }

    public static JPanel displayBoard(Board board) {
        JPanel panel = new JPanel(new GridLayout(6, 12)); // Assuming a 12x6 grid for the board
        for (Tilemodel tile : board.getTiles().values()) {
            JPanel tilePanel = new JPanel();
            tilePanel.setBackground(tile.getColor());
            tilePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            tilePanel.add(new JLabel(tile.getName()));
            panel.add(tilePanel);
        }
        return panel;
    }
}