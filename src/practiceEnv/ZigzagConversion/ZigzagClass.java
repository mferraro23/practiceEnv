package practiceEnv.ZigzagConversion;

import java.util.Arrays;

public class ZigzagClass {
    public ZigzagClass(){
        int rows = 3;
        String s = "PAYPALISHIRING";

        System.out.println(ZigzagRun(rows, s));
    }
    public String ZigzagRun(int numRows, String s){
        // Base Case
        if (numRows <= 1){
            return s;
        }
        // Declare StringBuilder Array
        StringBuilder[] newString = new StringBuilder[numRows];
        // Init newStringBuilder for each index
        for (int l = 0; l < numRows; l++){
            newString[l] = new StringBuilder();
        }
        // Declare finalString to append all indices to
        StringBuilder finalString = new StringBuilder();

        // Direction = 0 means we are going 0->numRows
        int direction = 0;
        for(int i=0, j=0; i<s.length();i++){
            // If at the bottom then append in ascending order
            if (direction == 0){
                boolean top = j>=numRows-1;
                newString[j].append(s.charAt(i));
                if(top){
                    // Direction = 1 means we are going numRows->0
                    direction = 1;
                }
                // Check if we are at the top
                j = top ? (j-1):(j+1);
            }
            // If at the top then append in descending order
            else{
                boolean bottom = j<=0;
                newString[j].append(s.charAt(i));
                if(bottom){
                    direction = 0;
                }
                j = bottom ? (j+1):(j-1);
            }
        }
        // Append each StringBuilder index to finalString
        for(StringBuilder l: newString){
            finalString.append(l);
        }
        return finalString.toString();
    }
}
