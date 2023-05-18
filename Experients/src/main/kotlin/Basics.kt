@file:Suppress("unused")

fun facadeMain()
{
    basicFunc()
    nulling()
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
