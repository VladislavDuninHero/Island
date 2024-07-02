package org.island.service.factory;

import lombok.Getter;
import org.island.constants.messages.Message;
import org.island.exception.CreateOrganismsError;
import org.island.model.AbstractIslandObject;
import org.island.model.organisms.animals.Animal;
import org.island.model.organisms.animals.Sheep;
import org.island.model.organisms.animals.Wolf;
import org.island.model.organisms.plants.Herb;


import java.util.Map;
import java.util.function.Supplier;

public class OrganismFactory {

    @Getter
    private final Map<Integer, Supplier<AbstractIslandObject>> organismMap = Map.ofEntries(
            Map.entry(1, Sheep::new),
            Map.entry(2, Wolf::new),
            Map.entry(3, Herb::new)
    );

    public AbstractIslandObject createOrganism(int id) {
        if (!organismMap.containsKey(id)) {
            throw new CreateOrganismsError(Message.CREATE_ORGANISM_ERROR);
        }

        return organismMap.get(id).get();
    }

    public int getOrganismIdOnClassBased(Class<? extends Animal> clazz) {
        int id = 0;
        for (Map.Entry<Integer, Supplier<AbstractIslandObject>> organism : organismMap.entrySet()) {
            if (clazz == organism.getValue().get().getClass()) {
                id = organism.getKey();
            }
        }

        return id;
    }
}
