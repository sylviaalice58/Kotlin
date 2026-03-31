class Person{
    // AttributesCharacteristics/properties of a person
    var name ="James"
    var age = 46
    var wieght = 58
    var height =1.75

    // Behaviours/actions/doables
    fun walk(){
        println("The person can walk")
    }

    fun speak(){
        println("The person can speak...")
    }

    fun run(){
        println("The person can run...")
    }

    fun read(){
        println("The person can read...")
    }

}

fun main() {
    // Objects is a real world thing
    // an object is intanciated/created/obtained from  a class
    // for us to be able to either access the property/behaviours of a class we require to have an object
    // below we create an object
    var myObject = Person()

    // below we us the dot separator to either access the function or  the property

    myObject.walk()
    myObject.read()
    myObject.run()

    println("The age of the person is:" + myObject.age)
}