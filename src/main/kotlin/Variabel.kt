/*
Variabel adalah sebuah tempat/wadah didalam memori komputer untuk menyimpan data seperti
data nama pengguna, kata sandi, data waktu, jumlah makanan dan lain-lain sebagainya.
 */

fun main(args: Array<String>) {
    var dynamicVar = 2 //system yang dinamis tidak memerlukan adanya deklarasi tipe
                        // data pada sebuah variabel, compiler secara otomatis akan mengenali tipe data dari sebuah variabel berdasarkan nilai yang diberikan kepadanya.
    println("Contoh dynamic variabel = " + dynamicVar)
    var staticVar: Char = 'A' //statis mengharuskan kita mendeklarasikan jenis tipe data tertentu
                        // dalam sebuah variabel dan tipe data tersebut tidak bisa diubah selama program dieksekusi.
    println("Contoh static variabel = " + staticVar)
}