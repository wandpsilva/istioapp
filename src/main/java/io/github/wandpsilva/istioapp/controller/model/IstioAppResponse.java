package io.github.wandpsilva.istioapp.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class IstioAppResponse {

    @JsonProperty
    private IstioAppResponseData data;

    @Getter
    @Setter
    @AllArgsConstructor
    public static class IstioAppResponseData {

        @JsonProperty
        private String message;
    }
}
