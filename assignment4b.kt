// Inheritance is a core concept of Object-Oriented Programming (OOP).
// It allows a class to reuse properties and functions of another class.

// Parent class (Super class / Base class) → the class being inherited from
// Child class (Subclass / Derived class) → the class that inherits

open class Animal(val name: String) {
    fun eat() {
        println("$name is eating")
    }
}

class Dog(name: String) : Animal(name) {
    fun bark() {
        println("$name is barking")
    }
}

fun main() {
    val myDog = Dog("Buddy")
    myDog.eat()   // Inherited from Animal
    myDog.bark()  // Defined in Dog
}