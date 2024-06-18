package org.island.factory;

import lombok.Getter;
import org.island.controllers.SerializationJsonService;
import org.island.dto.config.AnimalConfig;
import org.island.dto.plants.Herb;
import org.island.dto.plants.Plant;

import java.io.File;
import java.util.Map;
import java.util.function.Supplier;

public class PlantsFactory {

    SerializationJsonService serializationJsonService = new SerializationJsonService();
    private final File HERB = new File("src/main/resources/plants/Herb.json");
    private final AnimalConfig HERB_CONFIG = serializationJsonService.parseJson(HERB);

    @Getter
    Map<Integer, Supplier<Plant>> plants = Map.ofEntries(
            Map.entry(1, () -> new Herb(HERB_CONFIG.getWeight(), HERB_CONFIG.getMaxCountInOneCell()))
    );

    public Plant createPlant(int id) {
        if (!plants.containsKey(id)) {
            throw new IllegalArgumentException();
        }

        Supplier<Plant> plantSupplier = plants.get(id);

        return plantSupplier.get();
    }
}
