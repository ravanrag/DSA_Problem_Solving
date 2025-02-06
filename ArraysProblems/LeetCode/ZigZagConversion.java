package ArraysProblems.LeetCode;

import java.util.ArrayList;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>s.length())  return s;
        ArrayList<StringBuilder> out= new ArrayList<>();
        for(int i=0; i<numRows;i++){
            out.add(new StringBuilder());
        }
        int index=1;
        out.get(0).append(s.charAt(0));
        while(index<s.length()){
            for(int i=1;i<numRows && index<s.length();i++){
                out.get(i).append(s.charAt(index));
                index++;
            }
            for(int i=numRows-2;i>=0 && index<s.length();i--){
                out.get(i).append(s.charAt(index));
                index++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i=0; i<numRows;i++){
            result.append(out.get(i).toString());
        }
        return result.toString();
    }
}
