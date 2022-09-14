class Solution {
    var max = 0
    var optimal = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    var n = 0
    var info = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

    fun solution(n: Int, info: IntArray): IntArray {
        this.n = n
        this.info = info
        dfs(intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))
        optimal[10] = n - optimal.sum()
        return if (max > 0)
            optimal
        else intArrayOf(-1)
    }

    private fun dfs(curAry: IntArray) {
        if (checkEnd(curAry)) {
            val pointDiff = calPoint(curAry, info)
            if (pointDiff > max) {
                max = pointDiff
                optimal = curAry
            }
            if (pointDiff == max) {
                optimal = compareAry(optimal, curAry)
            }
            return
        }

        for (i in 0..10) {
            if (curAry[i] == 0 && n - curAry.sum() > info[i]) {
                val newAry = curAry.clone()
                newAry[i] = info[i] + 1
                dfs(newAry)
            }
        }
    }

    private fun calPoint(lion: IntArray, apeach: IntArray): Int {
        var diff = 0
        for (i in 0..10) {
            if (lion[i] > apeach[i])
                diff += (10 - i)
            else if (lion[i] == 0 && apeach[i] == 0)
                diff += 0
            else
                diff -= (10 - i)
        }
        return diff
    }

    private fun checkEnd(ary: IntArray): Boolean {
        var end = true
        for (i in 0..10) {
            if (ary[i] == 0 && n - ary.sum() > info[i]) {
                end = false
            }
        }
        return end
    }

    private fun compareAry(a: IntArray, b: IntArray): IntArray {
        for (i in a.indices.reversed()) {
            if (a[i] > b[i])
                return a
            else if (a[i] < b[i])
                return b
            continue
        }
        return a
    }
}