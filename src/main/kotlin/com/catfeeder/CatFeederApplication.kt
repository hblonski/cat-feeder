package com.catfeeder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CatFeederApplication

fun main(args: Array<String>) {
    runApplication<CatFeederApplication>(*args)
}
