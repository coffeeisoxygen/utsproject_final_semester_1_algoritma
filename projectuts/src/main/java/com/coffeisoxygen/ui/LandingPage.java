package com.coffeisoxygen.ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LandingPage {
    public static void start() {
        // Frame
        JFrame frame = new JFrame("Hiking Game - Landing Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);

        // Left Panel: Game Icon
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setPreferredSize(new Dimension(300, 500));
        leftPanel.setBackground(new Color(34, 49, 63)); // Dark background

        JLabel imageLabel = new JLabel();
        java.net.URL imageUrl = LandingPage.class.getClassLoader().getResource("images/main/GameIcon.png");
        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(
                    new ImageIcon(imageUrl).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
            imageLabel.setIcon(icon);
        }
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        leftPanel.add(imageLabel, BorderLayout.CENTER);

        // Right Panel: Buttons
        JPanel rightPanel = new JPanel(new GridLayout(4, 1, 15, 15));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        rightPanel.setBackground(new Color(236, 240, 241)); // Light background

        // Buttons
        JButton createMapButton = createButton("Create Map", e -> {
            frame.dispose();
            // CreateMapPage.start();
        });
        JButton loadMapButton = createButton("Load Map", e -> {
            frame.dispose();
            // LoadMapPage.start();
        });
        JButton systemMapButton = createButton("System Map", e -> {
            frame.dispose();
            // SystemMapPage.start();
        });
        JButton exitButton = createButton("Exit", e -> System.exit(0));

        // Add Buttons
        rightPanel.add(createMapButton);
        rightPanel.add(loadMapButton);
        rightPanel.add(systemMapButton);
        rightPanel.add(exitButton);

        // Add Panels to Frame
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.CENTER);

        // Set Visible
        frame.setVisible(true);
    }

    private static JButton createButton(String text, java.awt.event.ActionListener action) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(new Color(41, 128, 185)); // Blue color
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        button.addActionListener(action);
        return button;
    }
}
