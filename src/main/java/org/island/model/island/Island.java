package org.island.model.island;

import lombok.Getter;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Island {
    public static Island instance;

    @Getter
    List<List<Cell>> island = new CopyOnWriteArrayList<>();

    private Island() {}

    public static synchronized Island getInstance() {
        if (instance == null) {
            instance = new Island();
        }

        return instance;
    }
}
