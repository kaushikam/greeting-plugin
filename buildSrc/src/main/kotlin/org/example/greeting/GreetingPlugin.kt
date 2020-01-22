package org.example.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin: Plugin<Project> {
	override fun apply(project: Project) {
		project.tasks.create("hello", Greeting::class.java) {
			it.group = "Welcome"
			it.description = "Displays welcome message"
			it.message = "Hello"
			it.recipient = "World"
		}
	}
}