// 
class Circle{
    // properties
    var radius = 7
    val pie =3.142

    //behaviours
    fun circleArea(){
        val areaOfCircle = pie * radius *radius
        println("The area of the circle is: " + areaOfCircle)
    }

    fun circleCircumference(){
        val circumference = pie * 2 * radius

        println("The circumference of the circle is: " + circumference)
    }

}

// Create a class for a rectangle and find the area as well as the perimemter of the rectangle
class Rectangle{
    var length = 12
    var width = 10

    fun recArea(){
        val areaOfRectangle = length * width 

        println("The area of the rectangle is :" + areaOfRectangle)
    }

    fun recPerimeter(){
        val perimiterOfRectangle = 2 *(length + width)

        println("The perimeter of the rectangle is: " + perimiterOfRectangle)
    }
}

fun main() {
    // bellow is our object
    var myCircle = Circle()

    myCircle.circleArea()

    var myRectangle =Rectangle()

    myRectangle.recPerimeter()
    
}