package org.island.factory;

import org.island.dto.plants.Herb;
import org.island.dto.plants.Plant;

import java.util.Map;
import java.util.function.Supplier;

public class PlantsFactory {
    Map<Integer, Supplier<Plant>> plants = Map.ofEntries(
            Map.entry(1, Herb::new)
    );

    public Plant createPlant(int id) {
        if (!plants.containsKey(id)) {
            throw new IllegalArgumentException();
        }

        Supplier<Plant> plantSupplier = plants.get(id);

        return plantSupplier.get();
    }
}
