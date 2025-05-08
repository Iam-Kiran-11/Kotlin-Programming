fun main() {
    print("Enter the temperature in fahrenheit: ")
    val fahrenheit = readLine()!!.toDouble()
    val celsius = (fahrenheit - 32)* 5 / 9
    println("Equivalent Celsius value: $celsius") 
    
}

