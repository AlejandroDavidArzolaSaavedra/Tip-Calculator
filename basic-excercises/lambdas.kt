fun main() {
    val treatFunction = trickOrTreat(false) {"$it quarters"}
    val trickFuntion = trickOrTreat(true, null)
    repeat(4){
    	treatFunction()        
    }
    trickFuntion()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick){
        return trick
    }else {
        if(extraTreat != null){
        	println(extraTreat(5))
        }
        return treats
    }
}
val trick = { println("No treats!") }

val treats = { println("Have a treat!") }

val extra: () -> Unit = { println("helllo!!!")}
