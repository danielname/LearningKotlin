import kotlin.math.floor

fun myName(arg: String){
    println("**********\n* $arg *\n**********")
}

fun strings(){
    var rawString = """
        Hello
           World!
             imdaniel
    """.trimIndent()

    var x=5
    var plantString = "x is $x" //called templates

    println(rawString)
    println(plantString)

    println("The Area of the circle is ${circle()}")

}

fun circle(): Double {
    val radius = (Math.random() * 10) + 1
    println(radius)
    return (radius * radius * Math.PI)
}

fun conditionals(num:Int){
    val trueFalse = if (num>1) "true" else "false"
    println(trueFalse)
}

fun validTriangle(): Boolean {
    val sideA = Math.random() * 20
    val sideB = Math.random() * 20
    val sideC = Math.random() * 20
    println("A is $sideA, B is $sideB, C is $sideC")
    return if (sideA + sideB > sideC){
        if (sideA + sideC > sideB) {
            sideB + sideC > sideA
        } else false
    } else false
}

fun randomMonth(){
    val ranNum = floor(Math.random() * 13 + 1).toInt()
    when(ranNum){
        1-> println("January")
        2-> println("February")
        3-> println("March")
        4-> println("April")
        5-> println("May")
        6-> println("June")
        7-> println("July")
        8-> println("August")
        9-> println("September")
        10-> println("October")
        11-> println("November")
        else-> println("December")

    }
}

//loops
//while and do while are the same
//for is like python

fun arrays(){
    val arrayOfDoubles = DoubleArray(10)
    for (n in 0..9)
        arrayOfDoubles[n] = Math.random()
    var average = 0.0
    for (value in arrayOfDoubles) {
        println(value)
        average += value
    }
    average /= 10
    for (value in arrayOfDoubles)
        if (value > average){
            println("Higher")
        } else {
            println("Lower")
        }

}

class Book constructor(title: String, authorName: String, numOfPages: Int){

    init {
        println("$title is a great book")
    }

    constructor(title: String):this(title,"Dr. Suess",20)
}

/**
long comments can be written in slash star with double star hi-lighting it
 */
fun main(args: Array<String>) {
    val x=2 //type inferred because variable (constant) defined and set
    val y:Int //type declared (I in Int MUST BE CAPITALIZED)
    val z:Int=2 //this is fine, but unnecessary
//    val w:int=4.6 //type mismatch, will not compile, NO IMPLICIT CASTING
    println("Hello\nWorld!")
    circle()
    strings()
    conditionals(0)
    println(validTriangle())
    randomMonth()
    arrays()
    val book = Book("The Murder of Roger Ackroyd", "Agatha Christie", 200)
    val cat = Book("The cat in the hat")
}