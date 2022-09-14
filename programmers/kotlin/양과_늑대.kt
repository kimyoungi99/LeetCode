class Solution {
    lateinit var edges: Array<IntArray>
    lateinit var info: IntArray
    var max = 1

    fun solution(info: IntArray, edges: Array<IntArray>): Int {
        this.edges = edges
        this.info = info
        dfs(intArrayOf(0), 0, 0, 0)
        return max
    }

    private fun dfs(cur: IntArray, s: Int, w: Int, curNode: Int) {
        var sheep = s
        var wolf = w

        if (info[curNode] == 0)
            sheep++
        else
            wolf++
        
        if (sheep <= wolf)
            return

        if (sheep > max)
            max = sheep
        
        if (adjacentNodeArray(cur).isEmpty())
            return
        

        for (i in adjacentNodeArray(cur)) {
            val newAry = addElement(cur.clone(), i)
            dfs(newAry, sheep, wolf, i)
        }
    }

    private fun addElement(ary: IntArray, value: Int): IntArray {
        val list = ary.toMutableList()
        list.add(value)
        return list.toIntArray()
    }

    private fun adjacentNodeArray(cur: IntArray): IntArray {
        return edges.filter { cur.contains(it[0]) || cur.contains(it[1]) }.map { it.toList() }.flatten().distinct()
            .filter { !cur.contains(it) }.toIntArray()
    }
}