package practiceEnv.StringToInt;

public class StringToIntegerClass {
    public StringToIntegerClass(){
        String s = "-298239483957349578734739473947937";
        System.out.println(toInt(s));
    }
    public int toInt(String s){
        String integerString = s.strip();
        //-----------------Base Case-----------------
        if(integerString.isEmpty()){
            return 0;
        }
        else if(integerString.charAt(0) != '-'){
            if(!Character.isDigit(integerString.charAt(0))){
                return 0;
            }
        }
        int count = 0;
        for(int i = 0; i<integerString.length(); i++){
            if(!Character.isDigit(integerString.charAt(i))){
                count+=1;
            }
        }
        if (count == integerString.length()){
            return 0;
        }
        //-----------------Base Case-----------------

        int returnInt;
        int posFlag = 0;
        if(integerString.charAt(0) == '+' ){
            integerString = integerString.substring(1);
        }
        else{
            posFlag = 1;
        }
        for(int i = 0; i < integerString.length(); i++){
            if(integerString.charAt(i) != '-' && !Character.isDigit(integerString.charAt(i))){
                integerString = integerString.substring(0, i);
            }
        }

        try{
            returnInt = Integer.parseInt(integerString);
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
