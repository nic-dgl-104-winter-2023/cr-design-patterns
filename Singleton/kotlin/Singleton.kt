/* 
Implementing a Singleton in Kotlin is extemely simple. All we really need is 
the `object` keyword (rather than `class`) and the necessary behaviours and 
data for the Singleton object.

Singletons can be declared nested inside of other classes. These are typically
declared with the additional `companion` and is a common approach in many 
Android pattern.s
*/

object Singleton {

    // Data can be declared with the standard `val` and `var` keywords 
    val importantData = " "
    var moreImportantData = " "

    // Behaviours are typically declared as functions using the `fun` keyword
    // Other options are avilable 
    fun someImportantBehaviour() {
        // do some things...
    }

}

/* 
To call the Singleton simply call the object and/or data and behaviours using
standard dot notation.
*/

fun Main {

    val someData = Singleton.importantData

    Singleton.someImportantBehaviour()
    
}