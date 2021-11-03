# 리트코드 문제 정리

리트코드에서 해결한 문제 정리

## 문제 / 풀이
`*`의 경우 개선해야 함
| # | 문제 | 정답 | 정리 |
|---| ----- | -------- | --------------------- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java (Easy)](https://github.com/kimyoungi99/LeetCode/blob/main/java/001_two-sum(naive).java)<br>[Java (Hard)](https://github.com/kimyoungi99/LeetCode/blob/main/java/001_two-sum.java)| - 완전탐색의 경우 O(n^2)<br>- 해쉬 맵 을 활용하여 숫자를 찾는 방식으로 O(n)에 구현 가능|
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/002_add-two-numbers.java) | - 링크드 리스트를 한 노드 씩 탐색하며 더하기|
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/003_longest-substring-without-repeating-characters.java) | - 투 포인터 알고리즘|
| 8 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/008_string-to-integer-atoi.java) | - 주어진 알고리즘을 그대로 구현<br> - int자료형의 오버플로우를 고려하여 스트링 상태에서 숫자의 크기를 비교|
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/009_palindrome-number.java) | - 스트링으로 변환 후 뒤집에서 비교|
| 10 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/010_regular-expression-matching.java) | - dfs/백트래킹 활용
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/011_container-with-most-water.java)| - 투 포인터 알고리즘<br> - 양 끝에서 더 낮은 벽을 줄여오는 방식으로 탐색|
| 12 | [Integer to Roman](https://leetcode.com/problems/integer-to-roman/) | [Java*](https://github.com/kimyoungi99/LeetCode/blob/main/java/012_integer-to-roman.java)| - 규칙 & 재귀함수를 활용
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/013_roman-to-integer.java)| - 심볼 가치가 큰 순서대로 비교하며 반복
| 14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/014_longest-common-prefix.java)| - 각 스트링에 글자들을 비교하여 구함 
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/015_3sum.java)| - 정렬 후 첫 숫자를 정한 뒤 투 포인터 알고리즘.<br> - O(n^2)
| 16 | [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/016_3sum-closest.java)| - 15번과 동일
| 17 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/017_letter-combinations-of-a-phone-number.java)| - dfs를 활용하여 완전탐색<br> - O(4^n)
| 18 | [4Sum](https://leetcode.com/problems/4sum/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/018_4sum.java)| - 정렬 후 두 숫자를 투 포인터 알고리즘을 사용<br> - 해쉬맵을 활용하여 중복 체크
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/019_remove-nth-node-from-end-of-list.java)| - 링크드 리스트의 길이 계산 후
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/020_valid-parentheses.java)| - 스택을 활용하여 유효성 체크
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/021_merge-two-sorted-lists.java)| - 새 링크드 리스트 생성 후 두 리스트의 해드를 비교하며 붙임
| 22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/022_generate-parentheses.java)| - dfs/백트래킹 활용
| 23 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/023_merge-k-sorted-lists.java)| - 21과 원리 비슷<br>리스트들 중 가장 작은 수를 붙임
| 24 | [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/024_swap-nodes-in-pairs.java)| - 링크드 리스트를 따라가며 2 노드씩 바꿈
| 25 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/025_reverse-nodes-in-k-group.java)| - 3개의 포인터를 유지하며 링크드 리스트를 뒤집는다
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/026_remove-duplicates-from-sorted-array.java)| - 공간복잡도를 O(1)로 하기 위해 배열을 탐색하던 도중 중복이 발생하면 한칸 씩 앞으로 옮김
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/027_remove-element.java)| - 공간복잡도를 O(1)로 하기 위해 배열을 탐색하며 일치하면 한칸 씩 앞으로 옮김
| 28 | [Implement strStr()](https://leetcode.com/problems/implement-strstr/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/028_implement-strstr.java)| - substring을 구하여 비교한다
| 30 | [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/030_substring-with-concatenation-of-all-words.java)| - 해쉬 맵을 활용하여 각 word의 개수를 미리 저장한 뒤, 스트링을 탐색하며 매치를 찾는다
| 31 | [Next Permutation](https://leetcode.com/problems/next-permutation/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/031_next-permutation.java)| - 공간복잡도를 O(1)로 하기 위해 순열의 성질을 활용한다
| 32 | [Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/032_longest-valid-parentheses.java)| - 스택을 활용하여 최대길이를 구한다<br>- 시간 복잡도 : O(n)
| 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/033_search-in-rotated-sorted-array.java)| - 이진탐색의 원리를 활용하여 정렬된 배열의 상태에 따라 경우의 수를 나누어구한다

# 프로그래머스 문제 정리

프로그래머스에서 해결한 문제 정리

## 문제 / 풀이
`*`의 경우 개선해야 함
| 문제 | 정답 | 정리 | 레벨 |
| ----- | -------- | --------------------- |---|
| [멀쩡한 사각형](https://programmers.co.kr/learn/courses/30/lessons/62048) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/programmers/java/멀쩡한_사각형.java)| - gcd를 활용한 수학 문제 | lv2 |
| [124 나라의 숫자](https://programmers.co.kr/learn/courses/30/lessons/12899) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/programmers/java/124_나라의_숫자.java)| - 3진법을 계산하듯 계산하며 3으로 나누어 떨어지는 경우 1을 빼준다 | lv2 |
| [[1차] 뉴스 클러스터링](https://programmers.co.kr/learn/courses/30/lessons/17677) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/programmers/java/[1차]_뉴스_클러스터링.java)| - 두 스트링에 대한 map을 생성하여 각 원소의 개수를 계산한 뒤 합집합, 교집합의 크기를 구한다 | lv2 |
| [[1차] 셔틀버스](https://programmers.co.kr/learn/courses/30/lessons/17678) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/programmers/java/[1차]_셔틀버스.java)| - 콘의 출근 시간을 분 단위별로 가능 여부를 모두 계산해 본다 | lv3 |