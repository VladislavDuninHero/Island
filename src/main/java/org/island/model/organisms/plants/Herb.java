package org.island.model.organisms.plants;

import lombok.Getter;

@Getter
public class Herb extends Plant {
    private final String type = "herb";
    private final String config = "src/main/resources/plants/Herb.json";
}
