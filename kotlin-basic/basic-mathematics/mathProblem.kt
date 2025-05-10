fun main() {

    val num1: Double = 10.0 // First number
    val num2: Double = 3.0 // Second number

    val c: Double = num1 + num2 //Addition 
    val d: Double = num1 - num2 //Substraction
    val e: Double = num1/num2   //Division
    val f: Double = num1*num2  //Multiplication
    val g: Double = (num1/(num1+num2))*100 //Percentage of first number out of total of both number
    val h: Double = (num2/(num1+num2))*100 //Percentage of 2nd number out of total of both number
    val i: Double = num1 % num2 //Modulo of first number % 2nd number
    val j: Double = num2 % num2 //Modulo of 2nd number % first number

    //Printing the answers 
    
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)
}