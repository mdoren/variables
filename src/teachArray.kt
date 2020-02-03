fun main(){
    // Array of int of size 5 with the values [0,0,0,0,0]
    val arr = IntArray(5)
    // init with values
    var arr2 = IntArray(5){42;2;5;2;2}
    // [0,1,2,3,4]
    val arr3 = IntArray(5){it * 1}

    var sState = arrayOf<String>("IL", "WI", "IN", "NY")
    for (i in 0..sState.size -1){
        println("${sState[i]}")
    }
}