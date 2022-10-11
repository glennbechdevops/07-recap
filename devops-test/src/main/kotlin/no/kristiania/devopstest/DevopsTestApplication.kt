package no.kristiania.devopstest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevopsTestApplication

fun main(args: Array<String>) {
    runApplication<DevopsTestApplication>(*args)
}
