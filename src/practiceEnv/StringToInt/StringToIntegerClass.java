package practiceEnv.StringToInt;

public class StringToIntegerClass {
    public StringToIntegerClass(){
        String s = "                  -123bncnwixnwx";
        System.out.println(toInt(s));
    }
    public int toInt(String s){
        //-----------------Base Case-----------------
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                count+=1;
            }
        }
        if (count == s.length()){
            return 0;
        }
        //-----------------Base Case-----------------
        String integerString = s.strip();
        int returnInt;
        if(integerString.charAt(0) == '+' ){
            integerString = integerString.substring(1);
        }
        for(int i = 0; i < integerString.length(); i++){
            if((!(Character.isDigit(s.charAt(i)))) && integerString.charAt(i) != '-'){
                integerString = integerString.substring(integerString.indexOf("-"), i);
            }
        }
        System.out.println(integerString);
        //try{
        returnInt = Integer.parseInt(integerString);
        //}
        //catch (Exception e){

        //}

        return returnInt;

    }
}
