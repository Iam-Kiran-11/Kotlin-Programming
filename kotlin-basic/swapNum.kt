fun main() {

    //Swapping two numbers using a third number i.e., 'c'
    var a: Int = 10
    var b: Int = 15
    println("Before swapping, a = $a & b = $b")

    //Using a new number
    val c = a
    a = b
    b = c
    println("After swapping, a = $a & b = $b")

    //Swapping two numbers without using a third number
    var x: Int = 6
    var y: Int = 12
    println("Before swapping, x = $x & y = $y")

    x = x + y
    y = x - y
    x = x - y
    println("After swapping, x = $x & y = $y")

    
}