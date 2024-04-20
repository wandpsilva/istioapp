package io.github.wandpsilva.istioapp.controller;

import io.github.wandpsilva.istioapp.controller.model.IstioAppResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/istioapp/hello-word")
public class IstioAppController {

    @GetMapping("/ping")
    public ResponseEntity<IstioAppResponse> ping() {
        return ResponseEntity.ok(new IstioAppResponse(new IstioAppResponse.IstioAppResponseData("PONG V1")));
    }
}
