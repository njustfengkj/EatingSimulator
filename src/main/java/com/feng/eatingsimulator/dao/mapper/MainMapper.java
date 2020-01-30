package com.feng.eatingsimulator.dao.mapper;

import com.feng.eatingsimulator.dao.mapper.provider.MainProvider;
import com.feng.eatingsimulator.model.po.Food;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainMapper {
    @SelectProvider(type = MainProvider.class, method = "batchQueryFood")
    List<Food> batchQueryFood(String name);
}
