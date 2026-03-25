// 1. Using if statements or when statement, create a program to find if given year is leap or not

fun main() {
    
    val year = 1600

    if( ((year % 4 == 0) && (year % 100 !=0))  || (year % 400 == 0) ){
        println("$year is a leap year")
    }
    else{
        println("$year is not a leap year")
    }
}