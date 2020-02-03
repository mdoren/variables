    fun addSomeNumbers(x: Int,y: Int):Int{
        // any code you want
        var ans = x + y
        println("The sum is $ans")
        return ans
    }
    fun addSomeNumbers(x: Int,y: Int,z: Int):Int{
        // any code you want
        var ans = x + y + z
        println("The sum is $ans")
        return ans
    }


fun main(){
    var result = 0
    var result2 = 0

    result = addSomeNumbers(2,3)
    result2 = addSomeNumbers(4, 7,10)
    println("$result and $result2")
}

