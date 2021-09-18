package org.zerock.zb00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerr {

    @GetMapping("/hello")
    public String[] hello() {

        return new String[]{"AAA","BBB","CCC"};

    }
}
