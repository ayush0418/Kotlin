fun main() 
{
    myFunction()
    println(timesTwo(x = 23))
    println(timesThree(8))
    println(timesFour(4))
}

fun myFunction () : Unit       
{
    println("Ayush Bansal")
}

fun timesTwo (x:Int) : Int      // fun functionName(arg1: Type) : ReturnType
{
    val output = x * 2
    return output
}
fun timesThree (x:Int) : Int    // fun functionName(arg1: Type) : ReturnType
{
    return x * 3
}
fun timesFour (x:Int) = x * 4


/* 
  OUTPUT 
  Ayush Bansal
  46
  24
  16
*/
