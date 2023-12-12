package com.baltacristiandorin.smartbill.config;

import com.baltacristiandorin.jooq.public_.tables.daos.FibonacciDao;
import com.baltacristiandorin.jooq.public_.tables.daos.UsersDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public FibonacciDao fibonacciDao() {
        return new FibonacciDao();
    }

    @Bean
    public UsersDao usersDao() {
        return new UsersDao();
    }
}
