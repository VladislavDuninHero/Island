package org.island.service.plants;

import org.island.model.island.Island;
import org.island.service.factory.OrganismFactory;
import org.island.service.serialization.ReadJsonService;
import org.island.service.utils.RandomService;

public class GrowService {
    Island island = Island.getInstance();
    RandomService randomService = new RandomService();

    ReadJsonService readJsonService = new ReadJsonService();

    OrganismFactory organismFactory = new OrganismFactory();
    public void grow() {

        for (int i = 0; i < island.getIsland().size(); i++) {
            int randomCell = randomService.random(
                    0, island.getIsland()
                    .get(i)
                    .size()
            );
            int randomCount = randomService.random(1, 50);
            for (int j = 0; j < randomCount; j++) {
                island.getIsland().get(i).get(randomCell).getOrganisms().add(organismFactory.createOrganism(3));
            }
        }

        System.out.println("grow");
    }
}
