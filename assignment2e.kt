// while loop
// Used when you know exactly how many times the loop runs and it depends on the condition 
// Create a while loop to print all EVEN years from 2000 to 2025.

fun main() {
    var year =2000

    while ( year <= 2025 ){
        if (year % 2==0){
             println(year)
        }
       
        year++
    }
    
}