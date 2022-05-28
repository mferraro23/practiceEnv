package practiceEnv.LongestPalindromicString;

import java.util.Arrays;

public class PalindromicClass {
    public PalindromicClass(){
        String s = "jbscjsncjbcjksnkvnsrhcbeclcmnsjvbsjvbgfyrgfgfgfsbnckasmclamlamclsmclsmcspcmekvngfyiouhhutrdrdtrvybunimkokhuftdtgvjhjhkj";
        System.out.println(PalindromicClassRun(s));
    }
    public String PalindromicClassRun(String s) {
        // can improve
        StringBuilder s1;
        StringBuilder max = new StringBuilder();
        int atempts = 0;
        if (s.length() <= 1) {
            return s;
        } else if (s.length() == 2 && s.charAt(0) != s.charAt(1)) {
            return String.valueOf(s.charAt(0));
        } else if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return s;
        } else {
            for (int i = 0; i < s.length(); i++) {
                for (int j = s.length() - 1; j > 0; j--) {
                    if (i!=j && s.charAt(i) == s.charAt(j)) {
                        if(i>j){
                            s1 = new StringBuilder(s.substring(j, i+1));
                        }
                        else{
                            s1 = new StringBuilder(s.substring(i, j + 1));
                        }
                        if (s1.toString().equals(s1.reverse().toString())) {
                            if(atempts==0){
                                return s1.toString();
                            }
                            if(max.length()<s1.length()){
                                max = s1;
                            }
                        }
                    }
                    atempts+=1;
                }
            }
        }
        if(max.length()<1){
            return String.valueOf(s.charAt(0));
        }
        return max.toString();
    }
}
