package practiceEnv.ZigzagConversion;

public class ZigzagClass {
    public ZigzagClass(){
        int rows = 3;
        String s = "PAYPALISHIRING";

        System.out.println(ZigzagRun(rows, s));
    }
    public String ZigzagRun(int rows, String s){
        // only works with rows = 3
        // fix for more rows
        // --------------------------- //
        // Create StringBuilderList
        // For each character index add to corresponding array index
        // Once index rows is reached head back up the StringBuilderList
        // Continue Zigzag pattern
        // Combine all StringBuilderLists into one StringBuilder, return that StringBuilder.toString().
        StringBuilder newString = new StringBuilder();
        int currentRow = 0;
        while(currentRow != rows){
            if (currentRow == rows-1){
                newString.append("\n");
                for(int i = 0; i <s.length(); i++){
                    if (i % 2 == 0 && i % 4 != 0) {
                        newString.append(s.charAt(i));
                        newString.append("   ");
                    }
                }
            }
            else if (currentRow % 2 == 0){
                newString.append("\n");
                for(int i = 0; i <s.length(); i++){
                    if (i % 4 == 0) {
                        newString.append(s.charAt(i));
                        newString.append("   ");
                    }
                }
            }
            else{
                newString.append("\n");
                for(int i = 0; i <s.length(); i++){
                    if (i % 2 == 1){
                        newString.append(s.charAt(i));
                        newString.append(" ");
                    }
                }
            }
            currentRow += 1;
        }

        return newString.toString();
    }
}
