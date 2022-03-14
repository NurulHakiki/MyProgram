/*
Literal di Kotlin akan memberikan tipe data secara otomatis setelah program dikompilasi sesuai
dengan nilai yang cocok untuk diberikan pada suatu variabel.
 */

fun main(args: Array<String>) {
    var intLiteral = 5  //Tipe data berbentuk integer
    var doubleLiteral = .02 //tipe data berbentuk double
    var stringLiteral = "Hello" //tipe data berbentuk string
    var charLiteral = '1' //tipe data berbentuk Character
    var boolLiteral = true //Tipe data berbentuk boolean
    println("intLiteral = " + intLiteral)  //Mencetak keluaran dari variabel yang berbentuk integer
    println("doubleLiteral = " + doubleLiteral) //Mencetak keluaran dari variabel yang berbentuk double
    println("stringLiteral = " + stringLiteral) //Mencetak keluaran dari variabel yang berbentuk String
    println("charLiteral = " + charLiteral) //Mencetak keluaran dari variabel yang berbentuk character
    println("boolLiteral = " + boolLiteral) //Mencetak keluaran dari variabel yang berbentuk boolean
}