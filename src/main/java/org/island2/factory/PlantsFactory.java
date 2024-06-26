package org.island2.factory;

import lombok.Getter;
import org.island2.models.plants.Herb;
import org.island2.models.plants.Plant;

import java.util.Map;
import java.util.function.Supplier;

public class PlantsFactory {

    @Getter
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
