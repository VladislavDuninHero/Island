package org.island.dto.organism;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChancesOfEating {
    @JsonProperty
    private int wolf;

    @JsonProperty
    private int sheep;
}
