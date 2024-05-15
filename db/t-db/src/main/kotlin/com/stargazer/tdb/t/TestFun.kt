package com.stargazer.tdb.t

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class TestFun {
    fun printTest(str: String) {
        println(str)
    }

    fun makeDoubleT(i: Int) = i * 2
}