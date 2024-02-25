package com.dsi.conteoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JKubeTestController {

    @GetMapping
    public String jKubeTest() {
        return "This is JKubeController";
    }

}
