// Nullable arrays (German 'Head First Kotlin' 1st ed., pp223)

fun main(args: Array<String>) {

    var myArray: Array<String?> = arrayOf("Hi", "Hows things?", null)

    for (i in myArray) {
        println(i) // funny: this prints the string 'null', if there's a null in the array
    }

}
