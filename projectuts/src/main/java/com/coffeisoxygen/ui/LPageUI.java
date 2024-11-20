package com.coffeisoxygen.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.coffeisoxygen.ui.animation.AnimatedButton;

public class LPageUI {
    private final static String PATHTOLPMAIN = "images/landing/GameIcon.png";
    private final static String PATHTOBTNCREATE = "images/buttons/createmap.png";
    private final static String PATHTOBTNLOAD = "images/buttons/loadmap.png";
    private final static String PATHTOSYTEMMAP = "images/buttons/systemmap.png";
    private final static String PATHTOSEXIT = "images/buttons/exit.png";

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setUndecorated(true); // Remove default frame controls
        frame.setSize(800, 500); // Adjust size
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(frame.getRootPane()); // Center window

        // ======= Left Panel (Image Section) =======
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setPreferredSize(new Dimension(300, 500));
        leftPanel.setBackground(new Color(34, 49, 63)); // Dark blue background
        JLabel imageLabel = new JLabel();
        java.net.URL imageUrl = LPageUI.class.getClassLoader().getResource(PATHTOLPMAIN);

        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(imageUrl);
            Image image = icon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
        } else {
            System.err.println("Image not found: " + PATHTOLPMAIN);
        }
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        leftPanel.add(imageLabel, BorderLayout.CENTER);

        // ======= Right Panel (Menu Section) =======
        JPanel rightPanel = new JPanel(new GridLayout(4, 1, 15, 15)); // Buttons only
        rightPanel.setBackground(new Color(236, 240, 241)); // Light gray background
        rightPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); // Add padding

        // Buttons
        AnimatedButton customMapButton = createMenuButton("Custom Map", PATHTOBTNCREATE);
        AnimatedButton loadMapButton = createMenuButton("Load Map", PATHTOBTNLOAD);
        AnimatedButton systemMapButton = createMenuButton("System Map", PATHTOSYTEMMAP);
        AnimatedButton exitButton = createMenuButton("Exit", PATHTOSEXIT);

        // Custom map action

        // Exit action
        exitButton.addActionListener(e -> System.exit(0));

        // Add buttons to panel
        rightPanel.add(customMapButton);
        rightPanel.add(loadMapButton);
        rightPanel.add(systemMapButton);
        rightPanel.add(exitButton);

        // Add components to frame
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.CENTER);

        // Show frame
        frame.setVisible(true);
    }

    private static AnimatedButton createMenuButton(String text, String iconPath) {
        java.net.URL iconUrl = LPageUI.class.getClassLoader().getResource(iconPath);
        ImageIcon icon = null;

        if (iconUrl != null) {
            icon = new ImageIcon(new ImageIcon(iconUrl).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        } else {
            System.err.println("Button icon not found: " + iconPath);
        }

        return new AnimatedButton(text, icon);
    }
}
