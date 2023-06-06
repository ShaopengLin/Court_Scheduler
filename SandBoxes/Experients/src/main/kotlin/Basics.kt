@file:Suppress("unused")

fun facadeBasic()
{
    basicFunc()
    nulling()
    practiceBasic()
    Strings()
    Ranges()
    ArrayLoop()
}
fun basicFunc()
{
    println(1 + 1)
    println(1 - 1)
    println(1 * 1)
    println(1 / 1.0)

    // Cannot be reassigned
    val fish: Int = 2

    println(fish.times(6))
    println(fish.toLong())

    // Resassignable
    var aquarium: Int = 1
    aquarium = 50
    println(fish + aquarium)

    val b: Byte = 1;
    val i: Int = b.toInt()
    println(i)
    println(1_000_000)
    println(999_999_999L::class.java.typeName)
    println(0xFF::class.java.typeName)
    println(0xFF_EC_DE_5E::class.java.typeName)
    println(0b1101::class.java.typeName)
    println(0b1101)
}

fun nulling()
{
    var i: Int? = null
    println(i)
    println(i?.toLong())
    var fishes: List<String?> = listOf(null)
    var fishesNull: List<String>? = null
    var fishesNull2: List<String?>? = null
    println(fishes)
    println(fishesNull)
    println(fishesNull2)
    // fish!!.toList() will raise exception.
    println(fishesNull?.get(0) ?: 0)
    println(fishes?.get(0) ?: 0)
}

fun practiceBasic()
{
    var fish_init: Int = 2.plus(71).plus(233).minus(13);
    println("Fish Number: $fish_init")
    println("Container: " + fish_init.div(30).inc().toString())
    var rainbowColor: String = "rainbow"
    rainbowColor = "new rainbow"
    val blackColor: String = "black"
    // blackColor = "new black"

    var nullTest: Int? = null
    println(nullTest?.inc() ?: 0)
    nullTest = 1
    println(nullTest?.inc() ?: 0)


}
fun Strings()
{
    val numberOfFish = 5
    val numberofPlants = 12
    println("I have $numberOfFish and $numberofPlants")
    println("I have ${numberOfFish + numberofPlants}")
}
fun Ranges()
{
    var fish: Int = 5
    println( fish in 1..100)

    // switch case
    when (fish) {
        0 -> {
            println("ok")
        }
        5 -> {
            println("not ok")
        }
        else -> {
            println("find")
        }
    }

}

fun ArrayLoop()
{
    // elements can be changed
    val somelist: MutableList<String> = mutableListOf("1", "2")
    val notmute: List<String> = listOf("1")
    // notmute.remove() does not exist
    somelist.removeAt(0)
    println(somelist)

    // Can mix
    var mixArray = arrayOf("fish", 2)
    mixArray.set(1, 1.0)
    println(mixArray.toList())
    println( arrayOf("").toList())
    println(intArrayOf(1, 2, 3).toList())
    println(arrayOf<String>("1").toList())
    println(arrayOf(arrayOf(1, 2), arrayOf(1, 2)).asList())

    // it represent single parameter lambda
    val arr = Array(5) { it * 3}
    println(arr.asList())

    // python style
    for (element in arr) println(element)

    // dict/indexElem style
    for ((index, element) in arr.withIndex())
        println("$index $element")

    for (i in 'b'..'g') print(i)
    for (i in 1..5) print(i)
    for (i in 5 downTo 0) print(i)
    for (i in 1..6 step 2) print(i)

}