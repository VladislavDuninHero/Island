package org.island.dto.organism;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;



@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganismConfig {
    @JsonProperty
    private String type;

    @JsonProperty
    private double weight;

    @JsonProperty
    private int maxSpeed;

    @JsonProperty
    private int maxCount;

    @JsonProperty
    private ChancesOfEating chancesOfEating;

}
