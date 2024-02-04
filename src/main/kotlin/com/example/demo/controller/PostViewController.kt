package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class PostViewController {

    @ResponseBody
    @RequestMapping(path = ["/"], method = [RequestMethod.GET])
    fun list(): String {
        return "Здесь будет главная страница"
    }

    @ResponseBody
    @RequestMapping(path = ["/post/{id}"], method = [RequestMethod.GET])
    fun single(@PathVariable id: Long): String {
        return "Здесь будет страница поста №${id}"
    }
}