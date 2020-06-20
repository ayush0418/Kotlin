fun main()
{
   println(sum(2, 6))
   println(difference(10, 6))
   println(product(4, 6))
   println(division(12, 2))
}

// EXPRESSION BODY 
fun sum(a: Int, b: Int) = a + b
fun difference(a: Int, b: Int) = a - b
fun product(a: Int, b: Int) = a * b
fun division(a: Int, b: Int) = a / b

/* 
OUTPUT
8
4
24
6
*/
