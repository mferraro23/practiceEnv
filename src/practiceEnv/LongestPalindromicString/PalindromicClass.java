package practiceEnv.LongestPalindromicString;

import java.util.Arrays;

public class PalindromicClass {
    public PalindromicClass(){
        // fix
        // solution, start in the middle, compare index -1, index +1.
        // if equal continue.
        // if not equal create two new strings split at the original string middle. with the middle term at each end.
        /* NOT EQUAL, NOT EVEN
        String s = "sdaddca";
        StringBuilder s1 = new StringBuilder(s.substring(0, s.length() / 2)).append(s.charAt(((s.length())/2)+1));
        String s2 = s.substring(s.length()/2);
        System.out.println(s1 + "," + s2);
         */

        //System.out.println(PalindromicClassRun(s));
    }
    public String PalindromicClassRun(String s){
        StringBuilder newString = new StringBuilder(s);
        int len = s.length();

        if (len%2==0){
            newString.append("1");
        }
        int j  = len;
        for(int i = 0; i<s.length();i++){
            StringBuilder n = new StringBuilder(newString);
            if(newString.toString().equals(n.reverse().toString())){
                return newString.toString();
            }
            else{
                try{
                    newString = new StringBuilder(newString.substring(i+1, j));
                }
                catch(Exception e){
                    System.out.println("No Palindrome");
                    break;
                }

            }
            j-=1;
        }
        return s;
    }
}
