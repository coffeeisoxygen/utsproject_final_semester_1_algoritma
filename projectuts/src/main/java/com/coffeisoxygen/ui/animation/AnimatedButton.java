package com.coffeisoxygen.ui.animation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AnimatedButton extends JButton {
    
    private static final Color HOVER_COLOR = new Color(41, 128, 185);
    private static final Color DEFAULT_COLOR = new Color(52, 73, 94);
    private static final Color TEXT_COLOR = Color.WHITE;

    public AnimatedButton(String text, Icon icon) {
        super(text);
        setIcon(icon);
        setFont(new Font("Arial", Font.BOLD, 16));
        setForeground(TEXT_COLOR);
        setBackground(DEFAULT_COLOR);
        setFocusPainted(false);
        setHorizontalAlignment(SwingConstants.LEFT); // Icon on the left
        setIconTextGap(10); // Gap between icon and text
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(HOVER_COLOR, 2),
                BorderFactory.createEmptyBorder(10, 15, 10, 15)));

        // Add hover effect
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(HOVER_COLOR);
                setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(HOVER_COLOR, 2),
                        BorderFactory.createEmptyBorder(12, 17, 12, 17))); // Padding for "pop" effect
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(DEFAULT_COLOR);
                setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(HOVER_COLOR, 2),
                        BorderFactory.createEmptyBorder(10, 15, 10, 15))); // Reset padding
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(HOVER_COLOR.darker()); // Darker color on click
            }
        });
    }
}