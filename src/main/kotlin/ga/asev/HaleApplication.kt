package ga.asev

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class HaleApplication

fun main(args: Array<String>) {
    SpringApplication.run(HaleApplication::class.java, *args)
}
