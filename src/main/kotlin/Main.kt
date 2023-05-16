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
    val raduis = (Math.random() * 10) + 1
    println(raduis)
    return (raduis * raduis * Math.PI)
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
}