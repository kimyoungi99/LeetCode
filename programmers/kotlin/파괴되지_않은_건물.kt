class Solution {
    lateinit var sum: Array<IntArray>

    fun solution(board: Array<IntArray>, skill: Array<IntArray>): Int {
        var answer = 0
        sum = Array(board.size + 1) { IntArray(board[0].size + 1) { 0 } }
        skill.forEach {
            if (it[0] == 1) {
                sum[it[1]][it[2]] -= it[5]
                sum[it[3] + 1][it[2]] += it[5]
                sum[it[3] + 1][it[4] + 1] -= it[5]
                sum[it[1]][it[4] + 1] += it[5]
            }
            else {
                sum[it[1]][it[2]] += it[5]
                sum[it[3] + 1][it[2]] -= it[5]
                sum[it[3] + 1][it[4] + 1] += it[5]
                sum[it[1]][it[4] + 1] -= it[5]
            }
        }

        for (i in 0..sum.size - 2) {
            for (j in 0..sum[0].size - 2) {
                sum[i][j + 1] += sum[i][j]
            }
        }
        for (i in 0..sum.size - 2) {
            for (j in 0..sum[0].size - 2) {
                sum[i + 1][j] += sum[i][j]
            }
        }
        for (i in 0..sum.size - 2) {
            for (j in 0..sum[0].size - 2) {
                sum[i][j] += board[i][j]
                if (sum[i][j] > 0)
                    answer++
            }
        }

        return answer
    }
}