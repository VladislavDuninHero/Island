package org.island.controllers.animalsServices.feedingServices;

import org.island.controllers.GenerateRandomService;
import org.island.dto.AbstractIslandObject;
import org.island.dto.animals.Animal;

import java.util.List;

public class EatService {

    private GenerateRandomService generateRandomService = new GenerateRandomService();

    public void eat(Animal who, Animal whom, List<AbstractIslandObject> island) {
        //todo должен отвечать за насыщение определенного животного другим животным
    }
}
