import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")
    facadeBasic()
    facadeFunction(args)
    println(getFortuneCookie())
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

}