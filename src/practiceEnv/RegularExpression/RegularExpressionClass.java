package practiceEnv.RegularExpression;

public class RegularExpressionClass {
    public RegularExpressionClass(){
        String s = "aa";
        String p = ".*";
        System.out.println(isMatch(s,p));
    }
    public boolean isMatch(String s, String p){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == p.charAt(i) || p.charAt(i) == '.'){
                return true;
            }
        }
        return false;
    }
}
