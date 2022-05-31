package practiceEnv.PalindromeNumber;

public class PalindromeNumberClass {
    public PalindromeNumberClass(){
        int num = 10;
        System.out.println(isPalindrome(num));
    }
    public boolean isPalindrome(int num){
        if(num<0){
            return false;
        }
        StringBuilder number = new StringBuilder(String.valueOf(num));
        return number.toString().equals(number.reverse().toString());
    }
}
