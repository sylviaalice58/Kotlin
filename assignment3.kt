fun main() {

    val points = 2089

    if(points < 0){
        println("Invalid points")
    }
    else if(points >= 0 && points<= 100){
        println("You do not Qualify")
    }
    else if(points >= 101 && points<= 400){
        println("You Win a Smartphone")
    }
    else if(points >= 401 && points <= 1000){
        println("You win a Laptop")
    }
    else{
        println("You win a Trip to Canada")
    }
    
}