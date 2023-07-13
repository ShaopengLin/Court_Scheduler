class Aquarium {
    // internal is package/module only
    // private is only to file/class
    // public for everyone
    // protected same
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100
    var volume: Int
        get() = width * height * length / 1000
        set(value) { height = (value * 1000) / (width * length)}
}

class SimpleSpice {
    var spiceName: String = "curry"
    var level: String = "mild"
    var heat: Int = 5
}

class Spice (var name: String, var spiciness: String = "mild"){
    init {
        println("$name, $spiciness")
    }
    val heat: Int
        get() { return when (spiciness) {
            else -> 5
        } }
}

open class Book () {
    var title = "book"
    var author = "author"
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook (var format: String = "text") : Book () {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount++
    }
}