package org.island2.dto.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ChancesOfEating {
    @JsonProperty
    private int self;

    @JsonProperty
    private int bear;

    @JsonProperty
    private int eagle;

    @JsonProperty
    private int wolf;

    @JsonProperty
    private int lion;

    @JsonProperty
    private int buffalo;

    @JsonProperty
    private int caterpillar;

    @JsonProperty
    private int hog;

    @JsonProperty
    private int mouse;

    @JsonProperty
    private int rabbit;

    @JsonProperty
    private int sheep;
}
