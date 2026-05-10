import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] stirs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<List<String>> anagramGroup = groupAnagrams(stirs);
        for (List<String> strings : anagramGroup) {
            System.out.println(strings);
        }
    }

    public static List<List<String>> groupAnagrams(String[] stirs) {
        Map<Integer, List<String>> groupAnagramMap = new HashMap<>();
        for (String word : stirs) {
            int num = getUniqueKey(word);
            groupAnagramMap.putIfAbsent(num, new ArrayList<>());
            groupAnagramMap.get(num).add(word);
        }
        return new ArrayList<>(groupAnagramMap.values());
    }

    private static int getUniqueKey(String s) {
        int random[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        int mul = 1;
        for (char c : s.toCharArray()) {
            mul = mul * random[c - 'a'];
        }
        return mul;
    }
}