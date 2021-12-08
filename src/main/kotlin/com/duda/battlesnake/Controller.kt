package com.duda.battlesnake

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping
    fun get(): GetDataModel {
        return GetDataModel()
    }

    @PostMapping("start")
    fun start(): String {
        return ""
    }

    @PostMapping("move")
    fun move(): MoveDataModel {
        return MoveDataModel()
    }

    @PostMapping("end")
    fun end(): String {
        return "end"
    }
}