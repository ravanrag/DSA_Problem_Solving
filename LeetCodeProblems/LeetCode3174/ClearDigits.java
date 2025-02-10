package LeetCodeProblems.LeetCode3174;

import java.util.Stack;

public class ClearDigits {
//    Approach 1 : having an extra marker array to mark the positions to printed or not
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();

    }
//    Approach 2 : using Stack to store the characters and pop out the letters when a number is visited
    public String clear_Digits(String s) {
        char[] ch = s.toCharArray();
        int[] mark = new int[s.length()];
        int marker=0;
        for(int i=0; i<s.length();i++){
            if(ch[i]>='0' && ch[i]<='9'){
                marker=i-1;
                mark[i]=-1;
                while(marker>=0){
                    if((!(ch[marker]>='0' && ch[marker]<='9') ) && mark[marker]==0)
                    {
                        mark[marker]=-1;
                        break;
                    }
                    marker--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
            if(mark[i]==0){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
