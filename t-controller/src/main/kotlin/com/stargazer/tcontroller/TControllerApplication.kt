package com.stargazer.tcontroller

import com.stargazer.tdb.config.UserRepoConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(UserRepoConfig::class)
class TControllerApplication

fun main(args: Array<String>) {
    runApplication<TControllerApplication>(*args)
}
