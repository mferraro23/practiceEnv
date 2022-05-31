package practiceEnv.StringToInt;

public class StringToIntegerClass {
    public StringToIntegerClass(){
        String s = "+-12";
        System.out.println(toInt(s));
    }
    public int toInt(String s){
        StringBuilder integerString = new StringBuilder(s.strip());
        int posFlag = 0, count = 0, returnInt;

        // If string is empty return 0
        if(integerString.isEmpty()){
            return 0;
        }

        // If it begins with negative sign set flag to 1
        if(integerString.charAt(0) == '-'){
            posFlag = 1;
            integerString = new StringBuilder(integerString.substring(1));
        }
        // If it begins with + don't change the flag
        else if(integerString.charAt(0) == '+'){
            integerString = new StringBuilder(integerString.substring(1));
        }
        for(int i = 0; i<integerString.length(); i++){
            if(!Character.isDigit(integerString.charAt(i))){
                integerString = new StringBuilder(integerString.substring(0,i));
                break;
            }
        }
        // If there are no Digits in the string return 0
        for(int i = 0; i<integerString.length(); i++){
            if(!Character.isDigit(integerString.charAt(i))){
                count+=1;
            }
        }
        if (count == integerString.length()){
            return 0;
        }

        try{
            if(posFlag == 1){
                integerString.reverse().append('-');
                integerString.reverse();
            }
            returnInt = Integer.parseInt(integerString.toString());
        }
        catch(NumberFormatException e){
            if(posFlag==0){
                returnInt = (int) ((Math.pow(2,31))-1);
            }
            else{
                returnInt = (int) ((Math.pow(-2,31)));
            }
        }

        return returnInt;

    }
}
