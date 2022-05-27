package practiceEnv.LongestPalindromicString;

import java.util.Arrays;

public class PalindromicClass {
    public PalindromicClass(){
        int current, next = 0;
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
        String s = "dsastv";
        System.out.println(PalindromicClassRun(s));

    }
    public String PalindromicClassRun(String s){
        StringBuilder s1 = new StringBuilder(s);
        String s2;
        int middle = s.length()%2!=0?(s.length()/2):s.length()/2-1;
        System.out.println(middle);
        boolean canBeFound = true;
        if(middle%2!=0){
            int i, j;
            i = middle - 1;
            j = middle+1;
            while(canBeFound){
                if (s.charAt(i)==s.charAt(j)){
                    s1 = new StringBuilder(s.substring(i,j+1));
                    i-=1;
                    j+=1;
                }
                else{
                    canBeFound = false;
                }
            }
        }

        else{
            // brute force change
            s1 = new StringBuilder(s.substring(0,middle+2));
            s2 = s.substring(middle);
            System.out.println(s1 + "," + s2);
        }
        return s1.toString();
    }
}
