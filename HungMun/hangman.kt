import java.io.File



fun main(){
    val hangman = listOf(
        """

    ______________
    |            |
    |            |
    |            O
    |          / | \
    |            |8===D 
    |           / \
    |
    |
    |___________________
    """.trimIndent(),
    """

    ______________
    |            |
    |            |
    |            O
    |          / | \
    |            |8==
    |           / \
    |
    |
    |___________________
    """.trimIndent(),
    """

    ______________
    |            |
    |            |
    |            O
    |          / | \
    |            |
    |           / \
    |
    |
    |___________________
    """.trimIndent(),
    """

    ______________
    |            |
    |            |
    |            O
    |          / | \
    |            |
    |           
    |
    |
    |___________________
    """.trimIndent(),
    """

    ______________
    |            |
    |            |
    |            O
    |          / 
    |           
    |           
    |
    |
    |___________________
    """.trimIndent(),
    """

    ______________
    |            |
    |            |
    |            O
    |          
    |           
    |          
    |
    |
    |___________________
    """.trimIndent(),
    """

    ______________
    |            |
    |            |
    |            
    |          
    |           
    |           
    |
    |
    |___________________
    """.trimIndent(),
    """

    
    
    |
    |
    |___________________
    """.trimIndent(),
    """

    
    
    ___________________
    """.trimIndent()
)
    val word = File("words.txt").readLines().random()
    var status = ".".repeat(word.length).toCharArray()
    var life = hangman.lastIndex
    println("Hello world")
    
    println(hangman[hangman.lastIndex])
    println(word)
    println(status)
    println(life)

    while(life >= 0 && status.contains('.') ){
            
            println(life)
            println(hangman[life])
            println(status)
            
            var input = readLine()!!
            println(input)
            if(input.length>1){
                if(input == word){
                status = input.toCharArray()
            }else{
                life--
            }
            }else{
                 if(input in word){
                word.forEachIndexed{ index , c ->
                    if(c in input){
                        status[index] = c
                    }
                }
            }else{
                life--
            }
            }
            
    }
    if(life>0){
        println("Jano vyhral si")
    }else{
        println("Prehral si jano")
    }
   
    
}