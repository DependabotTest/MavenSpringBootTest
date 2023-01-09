package com.example.maven_spring_boot_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MavenSpringBootTestApplication

fun main(args: Array<String>) {
	runApplication<MavenSpringBootTestApplication>(*args)
}
