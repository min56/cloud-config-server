package com.example.cloudconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@EnableConfigServer
@SpringBootApplication
class CloudConfigServerApplication

fun main(args: Array<String>) {
    runApplication<CloudConfigServerApplication>(*args)
}
