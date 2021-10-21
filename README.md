# 리트코드 문제 정리

리트코드에서 해결한 문제 정리

## 문제 / 풀이

| # | 문제 | 정답 | 아이디어 |
|---| ----- | -------- | --------------------- |
| 1 | [two-sum](https://leetcode.com/problems/two-sum/) | [Java (Easy)](https://github.com/kimyoungi99/LeetCode/blob/main/java/001_two-sum(naive).java)<br>[Java (Hard)](https://github.com/kimyoungi99/LeetCode/blob/main/java/001_two-sum.java)| 1. 완전탐색의 경우 O(n^2)<br>2. 해쉬 맵 을 활용하여 숫자를 찾는 방식으로 O(n)에 구현 가능|
| 2 | [add-two-numbers](https://leetcode.com/problems/add-two-numbers/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/002_add-two-numbers.java) | 1. 링크드 리스트를 한 노드 씩 탐색하며 더하기|
| 3 | [longest-substring-without-repeating-characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/003_longest-substring-without-repeating-characters.java) | 1. 투 포인터 알고리즘|
| 8 | [string-to-integer-atoi](https://leetcode.com/problems/string-to-integer-atoi/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/008_string-to-integer-atoi.java) | 1. 주어진 알고리즘을 그대로 구현<br>2. int자료형의 오버플로우를 고려하여 스트링 상태에서 숫자의 크기를 비교|
| 9 | [palindrome-number](https://leetcode.com/problems/palindrome-number/) | [Java](https://github.com/kimyoungi99/LeetCode/blob/main/java/009_palindrome-number.java) | 1. 스트링으로 변환 후 뒤집에서 비교|