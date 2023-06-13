import java.lang.StrictMath.random
import kotlin.random.Random

fun main(args: Array<String>) {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println( spices.filter { it.contains("curry") }.sortedBy { it.length })
    println( spices.take(3).filter { it.contains("curry") }.sortedBy { it.length })
    val rollDice: (Int) -> Int = { sides -> Random.nextInt(1, sides) }

}

fun isColdSadRainy(mood: String, weather: String = "Sunny", temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun isHot(temperature: Int) = temperature > 35
fun isHappySunny(mood: String, weather: String = "Sunny") = mood == "happy" && weather == "Sunny"
fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String {
    return when {
        isColdSadRainy(mood, weather, temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}