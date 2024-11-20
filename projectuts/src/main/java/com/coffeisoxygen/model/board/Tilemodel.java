package com.coffeisoxygen.model.board;

import java.awt.Color;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import com.coffeisoxygen.util.Coordinate;

public class Tilemodel {
    private String name;
    private TileCategory category;
    private Coordinate position;
    private Color color;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public Tilemodel(String name, TileCategory category, int posX, int posY) {
        this.name = name != null ? name : category.name();
        this.category = category;
        this.position = new Coordinate(posX, posY);
        this.color = category.getDefaultColor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        pcs.firePropertyChange("name", oldName, name);
    }

    public TileCategory getCategory() {
        return category;
    }

    public void setCategory(TileCategory category) {
        TileCategory oldCategory = this.category;
        this.category = category;
        this.color = category.getDefaultColor();
        pcs.firePropertyChange("category", oldCategory, category);
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        Coordinate oldPosition = this.position;
        this.position = position;
        pcs.firePropertyChange("position", oldPosition, position);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        Color oldColor = this.color;
        this.color = color;
        pcs.firePropertyChange("color", oldColor, color);
    }

    @Override
    public String toString() {
        return "Tilemodel{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", position=" + position +
                ", color=" + color +
                '}';
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}