fun main(){
    val list: List<Int> = listOf(21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10)
    println(reverse(list))

}

fun reverse (list: List<Int>): List<Int> {
    val result: ArrayList<Int> = arrayListOf()
    for (i: Int in 0 until list.size - 1) {
        val numnber: Int = list [list.size - 1 - i]
        result.add (numnber)
    }
    return result
}