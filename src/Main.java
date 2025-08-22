import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> result = wordCounter("hello world qwerty world teacher student teacher", 2);
        System.out.println(result);
    }

    public static List<String> wordCounter(String str, int n) {
        String[] words = str.split(" ");
        Map<String, Integer> counter = new HashMap<>();

        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == n) {
                result.add(entry.getKey());
            }
        }
        return result;
        //this returns result;
    }
}
