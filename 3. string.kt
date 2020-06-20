fun main() 
{

    val str = "AYUSH BANSAL"
    
    // Returns the length of the string
    val stringLength = str.length
    
    // Return the character at the index specified within the brackets
    val stringIndex = str.get(2)
    
    println(stringLength)
    println("The word at the position 2 is ${s.get(2)}")
    
    // Returns the substring between the startindex and the endindex but excluding the endindex character 
    println(s.subSequence(3,9))  
}


/* 
OUTPUT
12
The word at the position 2 is U
SH BAN
*/
