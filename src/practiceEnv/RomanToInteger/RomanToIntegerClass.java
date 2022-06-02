package practiceEnv.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerClass {
    public RomanToIntegerClass(){
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
        /*
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
        */
    }
    public int romanToInt(String s){
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) res -= map.get(s.charAt(i));
            else res += map.get(s.charAt(i));
        }
        return res + map.get(s.charAt(s.length()-1));
    }
}
