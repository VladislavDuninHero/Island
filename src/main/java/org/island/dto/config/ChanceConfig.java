package org.island.dto.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
public class ChanceConfig {
    @JsonProperty
    String type;

    @JsonProperty
    Map<String, Integer> chances;
}
