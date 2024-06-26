package org.island.model.island;

import lombok.Getter;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Getter
public class Island {
    List<List<Cell>> island = new CopyOnWriteArrayList<>();
}
