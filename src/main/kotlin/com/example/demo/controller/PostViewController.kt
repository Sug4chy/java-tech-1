package com.example.demo.controller

import org.springframework.stereotype.Controller
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

}