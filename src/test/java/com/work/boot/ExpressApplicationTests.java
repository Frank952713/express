package com.work.boot;

import com.work.boot.mapper.UserMapper;
import com.work.boot.utils.Md5Util;
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
    UserMapper userDao;

    @Test
    void contextLoads() {
    }

    @Test
    void getConnection() {
//        Long aLong = jdbcTemplate.queryForObject("select count(*) from express", Long.class);
//        log.info("记录总数:{}", aLong);
        String hash = Md5Util.getHash("123456");
        log.info("密码：{}",hash);
    }

}
