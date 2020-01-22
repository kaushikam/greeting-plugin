plugins {
	id("org.jetbrains.kotlin.jvm").version("1.3.61")
	id("java-gradle-plugin")
}

repositories {
	jcenter()
}

gradlePlugin {
	plugins {
		register("greetingPlugin") {
			id = "org.example.greeting"
			implementationClass = "org.example.greeting.GreetingPlugin"
		}

		removeIf {
			name == "java"
		}
	}
}


dependencies {
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}