// Create a function that accepts parameter that is able to do the coversion of degree celcius into  fahrenheit

fun main() {
    fun temperature(temp : Double){
        val fahrenheit = temp * (9.0/5.0) + 32

        println("The fahremheit is: $fahrenheit ")
    }
    temperature(42.5)

    println("==========================================")

    // create a function that is able to calculate the compound interest of a person
    fun compoundInterest(principal : Double , rate : Double , time : Double ,number : Double){
 
        val amount = principal *  Math.pow((1 + rate/number), (number * time))

        val ci = amount - principal

        println("The compound interst is : $ci")
    }
    compoundInterest(
        principal =50000.0,
        rate =0.03,
        time =2.0,
        number = 1.0

    )

    println("======================================================")

    // Research on how to put the square sign in kotlin answer
    fun area(){
        val length = 25
        val area = length * length

        println("The area of the square is : $area m\u00B2")
        // use ^ 2 more safer and no error
    }
    area()
    
    
}






// Research on inheritance in kotlin