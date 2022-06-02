package practiceEnv.IntegerToRoman;

public class IntegerToRomanClass {
    public IntegerToRomanClass(){
        /*
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
         */
        int num = 1000;
        System.out.println(intToRoman(num));
    }
    public String intToRoman(int num){
        StringBuilder roman = new StringBuilder();
        // Use simple arithmetic to convert int to roman numerals, break loop once 0 has been reached.
        while(num > 0){
            if (num>=1000){
                num -= 1000;
                roman.append("M");
            }
            else if (num >= 900){
                num -= 900;
                roman.append("CM");
            }
            else if (num >= 500){
                num -= 500;
                roman.append("D");
            }
            else if (num >= 400){
                num -= 400;
                roman.append("CD");
            }
            else if (num >= 100){
                num -= 100;
                roman.append("C");
            }
            else if (num >= 90){
                num -= 90;
                roman.append("XC");
            }
            else if (num >= 50){
                num -= 50;
                roman.append("L");
            }
            else if (num >= 40){
                num -= 40;
                roman.append("XL");
            }
            else if (num >= 10){
                num -= 10;
                roman.append("X");
            }
            else if (num >= 9){
                num -=9;
                roman.append("IX");
            }
            else if (num >= 5){
                num -= 5;
                roman.append("V");
            }
            else if (num >=4){
                num -= 4;
                roman.append("IV");
            }
            else{
                num -= 1;
                roman.append("I");
            }
        }
        return roman.toString();
    }
}