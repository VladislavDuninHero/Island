package org.island2.dto.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class HerbConfig {
    @JsonProperty
    private double weight;

    @JsonProperty
    private int maxCountInOneCell;
}
