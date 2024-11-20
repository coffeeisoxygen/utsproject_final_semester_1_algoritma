package com.coffeisoxygen.ui.mapeditor;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.coffeisoxygen.model.board.Board;
import com.coffeisoxygen.ui.LandingPage;
import com.coffeisoxygen.ui.PageMapPreview;

public class PageCreateCustomMap {
    public static void start() {
        JFrame frame = new JFrame("Create Map");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        Board board = new Board();
        // Add components to create a map (implement createMapComponents method)
        JPanel createMapPanel = createMapComponents(board);
        frame.add(createMapPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton previewButton = new JButton("Preview Map");
        JButton backButton = new JButton("Back to Menu");
        buttonPanel.add(previewButton);
        buttonPanel.add(backButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        previewButton.addActionListener(e -> {
            frame.dispose();
            PageMapPreview.start(board);
        });

        backButton.addActionListener(e -> {
            frame.dispose();
            LandingPage.start();
        });

        frame.setVisible(true);
    }

    private static JPanel createMapComponents(Board board) {
        // Implement the method to create map components
        JPanel panel = new JPanel();
        // Add components to create the map
        return panel;
    }
}