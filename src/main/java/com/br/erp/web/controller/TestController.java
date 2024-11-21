package com.br.erp.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/test1")
    public int test1() {
        return 1;
    }

    @PostMapping(value = "/test2")
    public int test2() {
        return 2;
    }

    @GetMapping
    public int test() {
        return 3;
    }
}
