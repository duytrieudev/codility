import java.util.HashMap

fun findDuplicates(nums: Array<Int>): MutableList<Int> {
    var myHashMap: HashMap<Int, Int> = hashMapOf()
    for (i in nums) {
        println(myHashMap.getOrDefault(i, 0))
        myHashMap.put(i, myHashMap.getOrDefault(i, 0) + 1)
    }
    println(myHashMap)
    val duplicate: MutableList<Int> = mutableListOf()
    for ((key, value) in myHashMap) {
        if (value > 1) {
            duplicate.add(key)
        }
    }
    return duplicate

}
