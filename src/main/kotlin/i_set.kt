fun main() {
//Set adalah koleksi yang memiliki elemen yang unik.

//Set<T> menyimpan elemen unik; urutan mereka umumnya tidak terdefinisi.
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")//mencetak nomer dari elements
    if (numbers.contains(1)) println("1 is in the set")
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")

//Implementasi default dari Set – LinkedHashSet – mempertahankan urutan penyisipan elemen
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())
    val strings = hashSetOf("a", "b", "c", "c") //hash set nilai unik
    println("My Set Values are"+strings)
}