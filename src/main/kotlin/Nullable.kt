// Nullable arrays (German 'Head First Kotlin' 1st ed., pp223)

fun main(args: Array<String>) {

    var myArray: Array<String?> = arrayOf("Hi", "Hows things?", null)

    for (i in myArray) {
        println(i) // funny: this prints the string 'null', if there's a null in the array
    }

    // btw: you can call first, declare later.
    // in the 70s, text had to be top-down-correct

    A()
    B()
    C()
    D()
}

// -------------------------------------------------------------------
// 4 examples in  'Be the compiler' in 'Head First Kotlin' Ch.8
// -------------------------------------------------------------------

class CatA(var name: String? = "") {
    fun Meow() { println("Meow") }
}

fun A() {
    var myCats = arrayOf(
            CatA("Misty"),
            null,
            CatA("Socks"))

    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.Meow()
        }
    }
}

// -------------------------------------------------------------------

class CatB(var name: String? = null) {
    fun Meow() { println("Meow") }
}

fun B() {
    var myCats = arrayOf(
            CatB("Misty"),
            CatB(null),
            CatB("Socks"))

    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.Meow()
        }
    }
}

// -------------------------------------------------------------------

class CatC(var name: String? = null) {
    fun Meow() { println("Meow") }
}

fun C() {
    var myCats = arrayOf(
            CatC("Misty"),
            null,
            CatC("Socks"))

    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.Meow()
        }
    }
}

// -------------------------------------------------------------------

class CatD(var name: String = "") {
    fun Meow() { println("Meow") }
}

fun D() {
    var myCats = arrayOf(
            CatD("Misty"),
//            CatD(null), // Kotlin: Null can not be a value of a non-null type String
            CatD("Socks"))

    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.Meow()
        }
    }
}
