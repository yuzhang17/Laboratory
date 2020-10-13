package com.yuzhang2.dbctemplatedemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JdbctemplatedemoApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        System.out.println(jdbcTemplate);
    }

    //更新
    @Test
    void update() {
    	String sql = "INSERT INTO employee(emp_name,salary) VALUE(?,?)";
        jdbcTemplate.update(sql, 1300.00);
    }

    @Test
    void batchUpdate() {
        String sql = "INSERT INTO employee(emp_name, salary) VALUE(?,?)";
        List<Object[]> batchArgs = List.of(new Object[]{"zhangsan", 100},
                new Object[]{"lisi", 200});
        jdbcTemplate.batchUpdate(sql,batchArgs);
    }


}
