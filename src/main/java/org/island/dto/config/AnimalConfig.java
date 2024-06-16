package org.island.dto.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AnimalConfig {

    @JsonProperty
    private double weight;

    @JsonProperty
    private int maxCountInOneCell;

    @JsonProperty
    private int maxCountCellInStep;

    @JsonProperty
    private double saturationOfEat;
}
