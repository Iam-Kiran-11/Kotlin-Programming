fun main() {
    println("Enter the marks that you scored: ")
    val marks = readLine()!!.toIntOrNull()

    //if-else is here, to distinguish different grades and pass or fail
if(marks != null){
    val score = when{                        //when is used here for different grades in what ranges
        marks >= 85 -> "A"                   //'->' this is used to connect input and output like if the input is 85(or more), output = A
        marks >= 70 -> "B"
        marks >= 41 -> "C"
        else -> "D"
    }
    val result = when{                      //when is used here for pass or fail in what rangee
        marks >= 41 -> "Passed"
        else -> "Failed"
    }
    println("Grade: $score")
    println("Result: $result")
 
}
else{
    println("Invalid input, please enter a valid number")
}
   
}