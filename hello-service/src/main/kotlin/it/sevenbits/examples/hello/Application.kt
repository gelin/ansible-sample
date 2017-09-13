package it.sevenbits.examples.hello

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}

@Controller
class HelloController {

    @Value("\${hello.name}")
    private lateinit var name: String

    @RequestMapping(value = "/")
    @ResponseBody
    fun hello(): String {
        return "Hello, $name!"
    }

}
