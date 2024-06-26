package org.island2.dto.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class IslandConfig {
    @JsonProperty
    private int x;

    @JsonProperty
    private int y;

    @JsonProperty
    private int initialOrganismsLimit;

    @JsonProperty
    private int timeOfSimulation;
}
