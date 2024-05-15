package com.stargazer.tdb.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@ComponentScan(basePackages = ["com.stargazer.tdb"])
@EntityScan(basePackages = ["com.stargazer.tdb.entity"])
@EnableJpaRepositories(basePackages = ["com.stargazer.tdb.repo"])
class UserEntityConfig {
}