 fun main() {

    println("Enter a number: ")        //for users to enter a number
    var num = readLine()!!.toDouble()

    while (num >= 0) {
        println("Timer is $num")      //as it is in decreasing order therefore '--' is used
        --num
    }
}