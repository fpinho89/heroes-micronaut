package br.com.fpinho.heroes

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.fpinho.heroes")
		.start()
}

