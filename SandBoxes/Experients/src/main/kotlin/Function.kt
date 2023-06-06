import kotlin.random.Random

fun facadeFunction(args: Array<String>) {
    println("Good ${if (args[0].toInt() < 12) "morning" else "night"}, Kotlin")
    println(randomDay())
}

fun randomDay(): String {
    val weekday = arrayOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    return weekday[Random.nextInt(7)]
}

fun getFortuneCookie(): String {
    val fortuneList: Array<String> = arrayOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!"
    )
    var input : UInt = (readlnOrNull()?.toUIntOrNull() ?: 1) as UInt
    return fortuneList[input.mod(fortuneList.size.toUInt()).toInt()]
}