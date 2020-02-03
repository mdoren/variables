fun main(){
    println("Enter a number 1 through 10:")
    var number = 0
    number = readLine()!!.toInt()
    var numberString = "x"

    when(number){
        1 -> numberString = "uno"
        2 -> numberString = "dos"
        3 -> numberString = "tres"
        4 -> numberString = "quatro"
        5 -> numberString = "cinco"
        6 -> numberString = "seis"
        7 -> numberString = "siete"
        8 -> numberString = "ocho"
        9 -> numberString = "nueve"
        10 -> numberString = "diez"
        !in 1..10 -> numberString = "Unavailable"
    }
    println("$number in Spanish is $numberString.")
}