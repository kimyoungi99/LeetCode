# 리트코드 문제 정리

리트코드에서 해결한 문제 정리

## 문제 / 풀이
`*`의 경우 개선해야 함
| # | 문제 | 정답 | 정리 |
|---| ----- | -------- | --------------------- |
| 1 | [two-sum](https://leetcode.com/problems/two-sum/) | [Java (Easy)](https://github.com/kimyoungi99/LeetCode/blob/main/java/001_two-sum(naive).java)<br>[Java (Hard)](https://github.com/kimyoungi99/LeetCode/blob/main/java/001_two-sum.java)| - 완전탐색의 경우 O(n^2)<br>- 해쉬 맵 을 활용하여 숫자를 찾는 방식으로 O(n)에 구현 가능|
| 2 | [add-two-numbers](https://leetcode.com/problems/add-two-numbers/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/002_add-two-numbers.java) | - 링크드 리스트를 한 노드 씩 탐색하며 더하기|
| 3 | [longest-substring-without-repeating-characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/003_longest-substring-without-repeating-characters.java) | - 투 포인터 알고리즘|
| 8 | [string-to-integer-atoi](https://leetcode.com/problems/string-to-integer-atoi/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/008_string-to-integer-atoi.java) | - 주어진 알고리즘을 그대로 구현<br> - int자료형의 오버플로우를 고려하여 스트링 상태에서 숫자의 크기를 비교|
| 9 | [palindrome-number](https://leetcode.com/problems/palindrome-number/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/009_palindrome-number.java) | - 스트링으로 변환 후 뒤집에서 비교|
| 10 | [regular-expression-matching](https://leetcode.com/problems/regular-expression-matching/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/010_regular-expression-matching.java) | - dfs/백트래킹을 활용
| 11 | [container-with-most-water](https://leetcode.com/problems/container-with-most-water/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/011_container-with-most-water.java)| - 투 포인터 알고리즘<br> - 양 끝에서 더 낮은 벽을 줄여오는 방식으로 탐색|
| 12 | [integer-to-roman](https://leetcode.com/problems/integer-to-roman/) | [Java*](https://github.com/kimyoungi99/LeetCode/blob/main/java/012_integer-to-roman.java)| - 규칙 & 재귀함수를 활용
| 13 | [roman-to-integer](https://leetcode.com/problems/roman-to-integer/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/013_roman-to-integer.java)| - 심볼 가치가 큰 순서대로 비교하며 반복
| 14 | [longest-common-prefix](https://leetcode.com/problems/longest-common-prefix/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/014_longest-common-prefix.java)| - 각 스트링에 글자들을 비교하여 구함 
| 15 | [3sum](https://leetcode.com/problems/3sum/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/015_3sum.java)| - 정렬 후 첫 숫자를 정한 뒤 투 포인터 알고리즘.<br> - O(n^2)
| 16 | [3sum-closest](https://leetcode.com/problems/3sum-closest/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/016_3sum-closest.java)| - 15번과 동일
| 17 | [letter-combinations-of-a-phone-number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/017_letter-combinations-of-a-phone-number.java)| - dfs를 활용하여 완전탐색<br> - O(4^n)
| 18 | [remove-nth-node-from-end-of-list](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/018_4sum.java)| - 정렬 후 두 숫자를 정하고 투 포인터 알고리즘을 사용<br> - 해쉬맵을 활용하여 중복 체크
| 19 | [4sum](https://leetcode.com/problems/4sum/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/019_remove-nth-node-from-end-of-list.java)| - 링크드 리스트의 길이 계산 후 삭제


# 프로그래머스 문제 정리

프로그래머스에서 해결한 문제 정리

## 문제 / 풀이
`*`의 경우 개선해야 함
| 문제 | 정답 | 정리 | 레벨 |
| ----- | -------- | --------------------- |---|
| [멀쩡한 사각형](https://programmers.co.kr/learn/courses/30/lessons/62048) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/programmers/java/멀쩡한_사각형.java)| - gcd를 활용한 수학 문제 | lv2 |