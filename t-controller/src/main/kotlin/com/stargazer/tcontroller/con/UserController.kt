package com.stargazer.tcontroller.con

import com.stargazer.tdb.entity.UserEntity
import com.stargazer.tdb.repo.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val repository: UserRepository
) {
    @GetMapping("/list")
    fun getAll(): List<UserEntity> {
        return repository.findAll()
    }

    @GetMapping
    fun create(@RequestParam name: String): Long {
        return repository.save(UserEntity(id = 0, name = name)).id
    }
}