fun main() {
    /*
    berikut ini adalah contoh pembuatan array dengan ukuran
    atau size 5 yang di mulai dari nol 0 sehingga mendapatkan
    nilai [0,1,4,9,16].
     */
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}