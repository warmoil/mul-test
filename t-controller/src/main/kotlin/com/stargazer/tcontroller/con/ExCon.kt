package com.stargazer.tcontroller.con

import com.stargazer.tdb.t.TestFun
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping()
class ExCon(
    private val t: TestFun
) {
    @GetMapping
    fun hello(): String {
        t.printTest("test")
        println(t.makeDoubleT(22))
        return "hello?"
    }


}