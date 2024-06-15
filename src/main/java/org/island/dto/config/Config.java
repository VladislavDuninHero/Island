package org.island.dto.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
public class Config {

    @JsonProperty
    private double weight;

    @JsonProperty
    private int maxCountInOneCell;

    @JsonProperty
    private int maxCountCellInStep;

    @JsonProperty
    private double saturationOfEat;
}
