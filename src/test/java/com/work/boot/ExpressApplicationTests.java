package com.work.boot;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.work.boot.dao.UserDao;
import com.work.boot.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
class ExpressApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
    }

    @Test
    void getConnection() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from express", Long.class);
        log.info("记录总数:{}", aLong);
    }

}
