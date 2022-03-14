fun main(args: Array<String>) {
    val myName: String = "Nurul Hakiki"
    for(chr in myName){
        print(chr)
    }
    var text = """
        for (c in "foo")
            print(c)
    """

    val s = "abc" + 1
    println(s + "def" )
    print('\n')
    println(text)
}

/*
String merupakan array dari karakter dan bersifat immutable (bersifat statis). Elemen suatu
String dapat diakses dengan operasi indeks array contoh s[i] atau dengan menggunakan for-loop.
 */
/*
Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan
raw String yang dipisahkan dengan triple quotes (""").
 */