package org.island.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class IslandConfig {

    @JsonProperty
    private int x;

    @JsonProperty
    private int y;
}
