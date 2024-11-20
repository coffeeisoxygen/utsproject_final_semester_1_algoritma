package com.coffeisoxygen.model.board;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private final Map<String, Tilemodel> tiles;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public Board() {
        tiles = new HashMap<>();
    }

    public void addTile(Tilemodel tile) {
        Tilemodel oldTile = tiles.put(tile.getName(), tile);
        pcs.firePropertyChange("tile", oldTile, tile);
    }

    public Tilemodel getTile(String name) {
        return tiles.get(name);
    }

    public void removeTile(String name) {
        Tilemodel oldTile = tiles.remove(name);
        pcs.firePropertyChange("tile", oldTile, null);
    }

    public Map<String, Tilemodel> getTiles() {
        return tiles;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}