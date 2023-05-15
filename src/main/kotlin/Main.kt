fun myName(arg: String){
    println("**********\n* $arg *\n**********")
}

fun main(args: Array<String>) {
    val x=2 //type inferred because variable (constant) defined and set
    val y:Int //type declared (I in Int MUST BE CAPITALIZED)
    val z:Int=2 //this is fine, but unnecessary
//    val w:int=4.6 //type mismatch, will not compile, NO IMPLICIT CASTING
    println("Hello\nWorld!")
    myName("Daniel")
}