package org.island.service.factory;

import lombok.Getter;
import org.island.model.AbstractIslandObject;
import org.island.model.organisms.animals.Sheep;
import org.island.model.organisms.animals.Wolf;
import org.island.model.organisms.plants.Herb;


import java.util.Map;
import java.util.function.Supplier;

public class OrganismFactory {
    //todo сделать кастомный exception для фабрики организмов

    @Getter
    private final Map<Integer, Supplier<AbstractIslandObject>> organismMap = Map.ofEntries(
            Map.entry(1, Sheep::new),
            Map.entry(2, Wolf::new),
            Map.entry(3, Herb::new)
    );

    public AbstractIslandObject createOrganism(int id) {
        if (!organismMap.containsKey(id)) {
            throw new IllegalArgumentException("this organism is not defined");
        }

        return organismMap.get(id).get();
    }
}