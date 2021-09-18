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

    @GetMapping("/hello2")
    public String[] hello2() {

        return new String[]{"가가가","나나니","다다다"};

    }
}
