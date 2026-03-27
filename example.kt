// create assignment3.kt and by use of for loop create an array of 7 counties and loop through them
   fun main(args: Array<String>) {
     val counties = arrayOf("Kisumu","Mombasa","Nairobi","Eldoret","Nakuru","Kilifi","Machakos")

    for(county in counties){
    if(county == "Nairobi" || county == "Kisumu"){
            print("$county ")
    }
    
    }
   }