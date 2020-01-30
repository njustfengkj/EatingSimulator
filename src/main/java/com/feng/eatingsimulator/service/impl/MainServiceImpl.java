package com.feng.eatingsimulator.service.impl;

import com.feng.eatingsimulator.dao.mapper.MainMapper;
import com.feng.eatingsimulator.model.po.Food;
import com.feng.eatingsimulator.service.MainService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    private final MainMapper mainMapper;

    public MainServiceImpl(MainMapper mainMapper) {
        this.mainMapper = mainMapper;
    }

    @Override
    public List<Food> batchQueryFood(String name) {
        return mainMapper.batchQueryFood(name);
    }
}
