//var di Kotlin digunakan untuk mendeklarasikan variabel yang nilainya dapat berubah sepanjang program dieksekusi.
//val digunakan untuk mendeklarasikan variabel konstan yang nilainya tidak akan berubah selama program dieksekusi.

fun main(args: Array<String>) {
    var varVariabel: Int
    varVariabel = 56 //Nilai variabel pertama yang dimasukkan
    println("Pemberian nilai pertama pada varVariabel = "+varVariabel)
    varVariabel = 78 //Nilai variabel kedua yang dimasukkan
    println("Pemberian nilai kedua pada varVariabel = "+varVariabel)
    /*
    val phi = 3.14
    phi = 2.5
     */

    /*
    Ketika kita merubah nilai variabel val phi untuk kedua kalinya maka akan terdapat pesan
kesalahan agar kita menggunakan var variabel.
     */
}