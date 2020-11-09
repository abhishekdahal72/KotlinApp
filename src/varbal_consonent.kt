fun main() {
    print("Enter a character")
    val chr = readLine()!![0]
//    checkVowel(chr)
    checkVowelUsingWhen(chr)
}

fun checkVowelUsingWhen(chr : Char){
    when(chr){
        'a', 'e', 'i', 'o' , 'u' ->
            print("vowel")
        else ->
            print("Consonent")
    }
}

//fun checkVowel(chr: Char) {
//    if (chr == 'a' || chr == 'e' || chr == 'i' ||
//        chr == 'o' || chr == 'u'
//    ) {
//        print("Vowel")
//    } else {
//        print("Consonent")
//    }
//}