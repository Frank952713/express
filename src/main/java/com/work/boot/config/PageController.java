package com.work.boot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author:WEIR
 * Date:2022/9/26 14:28
 * Description:
 */
public class PageController {

    @Configuration
    @MapperScan("com.work.boot.mapper")
    public class MpConfig {

        /**
         * 分页插件
         */
        @Bean
        public PaginationInterceptor paginationInterceptor() {
            PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
            // paginationInterceptor.setLimit(你的最大单页限制数量，默认 500 条，小于 0 如 -1 不受限制);
            return paginationInterceptor;
        }
    }
}
