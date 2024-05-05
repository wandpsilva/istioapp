package io.github.wandpsilva.istioapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/istioapp/hello-word")
public class IstioAppController {

    @GetMapping("/ping")
    public void ping() {
        log.info("PONG");
    }
}
