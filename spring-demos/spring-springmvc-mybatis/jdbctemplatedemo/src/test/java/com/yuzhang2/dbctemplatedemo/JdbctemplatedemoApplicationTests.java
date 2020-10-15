package com.yuzhang2.dbctemplatedemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    @Test
    void queryForObject() {
        String sql = "SELECT emp_id empId, emp_name empName, salary FROM employee WHERE emp_id=?";
        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), 1);
        System.out.println(employee);
    }

    @Test
    void queryForList() {
        String sql = "SELECT emp_id empId, emp_name empName, salary FROM employee WHERE salary>?";
        final List<Employee> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class), 1);
        System.out.println(query);
    }

    @Test
    void queryMaxSalary() {
        String sql = "SELECT max(salary)  FROM employee ";
        double max = jdbcTemplate.queryForObject(sql, Double.class);
        System.out.println(max);
    }


}
