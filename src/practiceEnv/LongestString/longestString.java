package practiceEnv.LongestString;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class longestString {
    public longestString(){
        // Declare String
        String s = "abcabcbb";

        // Returns integer value of the longest string (non-repeating)
        System.out.println(lengthOfLongestString(s));
    }
    public int lengthOfLongestString(String s){
        int max = 0;
        // Base case, if string is empty return 0
        if (Objects.isNull(s) || "".equals(s)) {
            return max;
        }

        Set<Character> charStrings = new HashSet<>();
        int current = 0;
        int next = 0;

        while (next < s.length()) {
            if(!charStrings.contains(s.charAt(next))) {
                charStrings.add(s.charAt(next));
                next++;
                max = Math.max(charStrings.size(), max);
            } else {
                charStrings.remove(s.charAt(current));
                current++;
            }
        }

        return max;
    }
}
