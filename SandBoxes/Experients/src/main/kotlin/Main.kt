import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")
    facadeBasic()
    facadeFunction(args)
    // println(getFortuneCookie())
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println(canAddFish(10.0, listOf(3,3,3)) )
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}