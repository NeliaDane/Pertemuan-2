fun main() {
    /*
    Array adalah koleksi data yang sejenis. dapat menggunakan fungsi arrayOf()
    dan melewatkan nilai item kepada array. alternative lain untuk membuat array
    dapat dengan fungsi arrayOfNulls().
    */
    var arrA = arrayOf<Int>()
    arrA += 34 //menambahkan elemen pada array
    println(arrA[0])

    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }

    for (i in arrB) {
        print("$i ")
    }
}
