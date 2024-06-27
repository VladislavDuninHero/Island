package org.island.dto.organism;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.Map;

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
    private Map<String, String> chanceOfEating;

}
