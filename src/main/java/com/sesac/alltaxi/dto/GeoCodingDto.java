package com.sesac.alltaxi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoCodingDto {
    @JsonProperty("formatted_address")
    private String formattedAddress;

    @JsonProperty("geometry")
    private GeometryDto geometryDto;
}
