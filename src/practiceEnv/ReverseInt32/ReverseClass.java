package practiceEnv.ReverseInt32;

public class ReverseClass {
    public ReverseClass() {
        // Test Cases
        int x = -145;
        System.out.println(reverse(x));
    }
    public int reverse(int x){
        // Create String value |x|
        StringBuilder reverseInt = new StringBuilder(String.valueOf(Math.abs(x)));
        // If x<0 add negative sign to end
        if(x<0){
            reverseInt.append("-");
        }
        reverseInt.reverse();
        // Catches 32bit unsigned and signed exception
        try{
            return Integer.parseInt(reverseInt.toString());
        }
        catch(Exception e){
            return 0;
        }
    }
}
