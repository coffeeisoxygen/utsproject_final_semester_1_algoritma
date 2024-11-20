package com.coffeisoxygen.model.board;

import java.awt.Color;

public enum TileCategory {

    REST(Color.GREEN),
    DANGER(Color.RED),
    NORMAL(Color.GRAY),
    START(Color.BLUE),
    END(Color.BLACK);

    private final Color defaultColor;

    TileCategory(Color defaultColor) {
        this.defaultColor = defaultColor;
    }

    public Color getDefaultColor() {
        return defaultColor;
    }
}