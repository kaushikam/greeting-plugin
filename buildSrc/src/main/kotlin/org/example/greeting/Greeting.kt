package org.example.greeting

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class Greeting: DefaultTask() {

	lateinit var message: String
	lateinit var recipient: String

	@TaskAction
	fun sayGreeting() {
		println("$message, $recipient!")
	}

}