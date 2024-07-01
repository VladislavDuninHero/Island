package org.island.service.island;

import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.island.Island;
import org.island.service.factory.OrganismFactory;
import org.island.service.utils.RandomService;

public class FillIslandService {

    RandomService randomService = new RandomService();
    OrganismFactory organismFactory = new OrganismFactory();

    public void fillIsland(Island island) {

        for (int i = 0; i < island.getIsland().size(); i++) {
            for (int j = 0; j < island.getIsland().get(i).size(); j++) {
                int randomSize = randomService.random(1, 10);
                for (int k = 0; k < randomSize; k++) {
                    int randomOrganism = randomService.random(1, organismFactory.getOrganismMap().size());
                    AbstractIslandObject organism = organismFactory.createOrganism(randomOrganism);
                    island.getIsland()
                            .get(i)
                            .get(j)
                            .getOrganisms()
                            .add(organism);
                }
            }
        }

    }
}
