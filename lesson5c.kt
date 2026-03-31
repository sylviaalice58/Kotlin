// inheritance is whereby a child classobtains the properties and behaviours of another class(parent class)

open class Animal {
    // properties
    var name = "Name"

    // behaviours
    fun walk(){
        println("The animal can walk")
    }

    fun sleep(){
        println("The animal can sleep")
    }
}

// below class inherits from the super/parent class animal
class Dog : Animal(){
    fun bark(){
        println("The dog likes barking...")
    }
}

fun main() {
    // Create an object
    var myDog =Dog()

    // accessing the behaviours of a dog
    myDog.bark()

    myDog.sleep()
    
}