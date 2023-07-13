fun main(args: Array<String>)
{
    buildAqua()
}

fun buildAqua()
{
    val myAqua = Aquarium()

    println("Length: ${myAqua.length} " +
            "Width: ${myAqua.width} " +
            "Height: ${myAqua.height} " +
            "Volumn: ${myAqua.volume}")

    val currySpice = SimpleSpice()
    println("${currySpice.spiceName}, ${currySpice.heat}")

    val spiceList:List<Spice> = List(5) {x -> Spice("$x")}
}