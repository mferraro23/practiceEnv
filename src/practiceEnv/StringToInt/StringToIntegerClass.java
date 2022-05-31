package practiceEnv.StringToInt;

public class StringToIntegerClass {
    public StringToIntegerClass(){
        String s = "+-12";
        System.out.println(toInt(s));
    }
    public int toInt(String s){
        String integerString = s.strip();
        int posFlag = 0;
        //-----------------Base Case-----------------
        if(integerString.isEmpty()){
            return 0;
        }
        if(integerString.charAt(0) == '+' ){
            integerString = integerString.substring(1);
        }
        if(integerString.charAt(0)=='-'){
            posFlag = 1;
            integerString = integerString.substring(1);
        }
        if(!Character.isDigit(integerString.charAt(0))){
            return 0;
        }


        //-----------------Base Case-----------------

        int returnInt;
        if (posFlag == 1){
            integerString = '-' + integerString;
        }

        for(int i = 0; i < integerString.length(); i++){
            if(integerString.charAt(i) != '-' && !Character.isDigit(integerString.charAt(i))){
                integerString = integerString.substring(0, i);
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
