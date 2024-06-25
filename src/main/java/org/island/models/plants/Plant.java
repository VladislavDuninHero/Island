package org.island.models.plants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.island.models.AbstractIslandObject;

import java.io.File;

@Getter
public abstract class Plant extends AbstractIslandObject {
    private int weight;
    private File herbConfig;
}
