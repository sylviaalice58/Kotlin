// create assignment3.kt and by use of for loop create an array of 7 counties and loop through them

// pg 29 and 30
// research on functions without parameters
// // 1. Create a For loop to print year from 2000 to 2025

fun main() {

    for (year in 2020 .. 2025){
        println("$year")
    }

    println("==========================================")

    // 2. Create a For loop to print from 100 to 1
    for(num in 100 downTo 1){
        println(num)
    }
    println("==============================")
    // 1. Create a while loop to print from -20 to +20
    var number = -20
     
    while(number <= 20){
        println(number)
        number++
    }

    println("==========================")
    // 2. Create a while loop to print all EVEN years from 2000 to 2025.

    var year =2000

    while ( year <= 2025 ){
        if (year % 2==0){
             println(year)
        }
       
        year++
    }
    println("==================================")
    // create assignment3.kt and by use of for loop create an array of 7 counties and loop through them
    val counties = arrayOf("Kisumu","Mombasa","Nairibi","Eldoret","Nakuru","Kilifi","Machakos")

    for(county in counties){
        println(county)
    }
}