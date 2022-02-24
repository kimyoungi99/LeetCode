import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        int w = Integer.parseInt(firstLine.split(" ")[0]);
        int n = Integer.parseInt(firstLine.split(" ")[1]);
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        String[] dict = new String[w];

        for (int i = 0; i < w; i++) {
            dict[i] = scanner.nextLine();
            map.put(dict[i], i);
        }

        String[] sortedDict = dict.clone();
        Arrays.sort(sortedDict);

        for (int i = 0; i < n; i++) {
            String query = scanner.nextLine();
            int ith = Integer.parseInt(query.split(" ")[0]);
            String word = query.split(" ")[1];

            String found = null;
            int index = Arrays.binarySearch(sortedDict, word);
            if (index < 0)
                index = -index - 1;
            if(index + ith - 1 < sortedDict.length && sortedDict[index + ith - 1].startsWith(word))
                found = sortedDict[index + ith - 1];
            if(found == null) {
                answer.add(-1);
                continue;
            }
            answer.add(map.get(found) + 1);
        }
        for (int ans : answer) {
            System.out.println(ans);
        }
    }
}