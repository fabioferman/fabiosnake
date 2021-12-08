package com.duda.battlesnake

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BattlesnakeApplication

fun main(args: Array<String>) {
    runApplication<BattlesnakeApplication>(*args)
}

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

class GetDataModel {
    var apiversion = "1";
    var author = "fabio";
    var color = "#888888";
    var head = "default";
    var tail = "default";
    var version = "0.0.1-beta";
}

class MoveDataModel {
    var move = "up";
    var shout = "Moving up!";
}