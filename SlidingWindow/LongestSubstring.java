import java.util.HashMap;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // duplicate check → move left
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            // update latest index
            map.put(ch, right);

            // calculate max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);

        System.out.println("Longest substring length: " + result);
    }
}