package com.feng.eatingsimulator.dao.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class MainProvider {
    public String batchQueryFood(String name) {
        return new SQL() {{
            SELECT("id, name, type, calorie, happiness_formula, full_factor, guilty_formula, digest_period, happiness_decay_formula");
            FROM("T_FOOD");
            WHERE("name=#{name,jdbcType=VARCHAR}");
        }}.toString();
    }
}
