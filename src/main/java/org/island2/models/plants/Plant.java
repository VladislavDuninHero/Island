package org.island2.models.plants;

import lombok.Getter;
import org.island2.models.AbstractIslandObject;

import java.io.File;

@Getter
public abstract class Plant extends AbstractIslandObject {
    private int weight;
    private File herbConfig;
}
