package practiceEnv.RegularExpression;

public class RegularExpressionClass {
    public RegularExpressionClass(){
        String s = "ab";
        String p = ".*";
        System.out.println(isMatch(s,p));
    }
    public boolean isMatch(String s, String p){
        // Base Case
        if (p.isEmpty()) return s.isEmpty();
        // Compare the first letter of s with first letter of p
        boolean first_match = (!s.isEmpty() &&
                (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        // Begin Recursive Call
        if (p.length() >= 2 && p.charAt(1) == '*'){
            return (isMatch(s, p.substring(2)) ||
                    (first_match && isMatch(s.substring(1), p)));
        } else {
            return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
}
