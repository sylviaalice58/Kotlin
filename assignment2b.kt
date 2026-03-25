// 1. Using if statements or when statement, create a program to find if given year is leap or not

fun main() {
    
    val year = 1600

    when{
        ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) -> println("$year is a leep year")
        else -> println("$year is not a leap year")
    }
}