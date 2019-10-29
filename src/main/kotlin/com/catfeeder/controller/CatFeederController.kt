package com.catfeeder.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("feeder")
class FeederController {

    private var shouldOpen = false

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    fun shouldOpen(): Boolean {
        if (shouldOpen) {
            shouldOpen = false
            return true
        }
        return false
    }

    @PostMapping("/open")
    @ResponseStatus(HttpStatus.OK)
    fun open() {
        shouldOpen = true
    }
}