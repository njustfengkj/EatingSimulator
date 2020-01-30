package com.feng.eatingsimulator.controller;

import com.feng.eatingsimulator.model.po.Food;
import com.feng.eatingsimulator.service.MainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/food")
public class FoodController {
    private final MainService mainService;

    public FoodController(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping(value = "/batchQuery", method = {RequestMethod.GET},produces = {"application/JSON"})
    protected List<Food> batchQuery(String name) {
        return mainService.batchQueryFood(name);
    }
}
