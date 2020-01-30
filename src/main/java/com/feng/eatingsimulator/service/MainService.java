package com.feng.eatingsimulator.service;

import com.feng.eatingsimulator.model.po.Food;

import java.util.List;

public interface MainService {
    List<Food> batchQueryFood(String name);
}
