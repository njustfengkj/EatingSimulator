package com.feng.eatingsimulator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class MainController {
    @RequestMapping(value = "/getTestMsg", method = RequestMethod.GET, produces = {"application/JSON"})
    protected String getTestMsg() {
        return "Hello, testMsg";
    }

    @RequestMapping(value = "/batchQueryFood", method = RequestMethod.GET, produces = {"application/JSON"})
    protected String batchQueryFood() {
        return "Hello, testMsg";
    }
}
