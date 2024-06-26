package org.island2.dto.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnimalConfig {

    @JsonProperty
    private String type;

    @JsonProperty
    private double weight;

    @JsonProperty
    private int maxCountInOneCell;

    @JsonProperty
    private int maxCountCellInStep;

    @JsonProperty
    private double saturationOfEat;

    @JsonProperty
    private ChancesOfEating chanceOfEating;
}
