package no.kristiania.devopstest.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloController {

        @RequestMapping
        fun hello(): String {
            return "Hello World!"
        }
}