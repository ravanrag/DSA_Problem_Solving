import GeeksForGeeks.LongestSubarraywithSumK;

import java.util.Scanner;
import java.util.Stack;
import GeeksForGeeks.LargestSubarrayWith0Sum;
public class ConvertNumberToString {
    static String castToSentence(long n) {
        if(n<0)
            return "invalid";
        if(n==0)
            return "Zero";
        Stack<String> word = new Stack<>();
        String[] firstTwenty = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen ","Twenty "};
        String[] tens = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
        String[] multiplier = {"", "Thousand ", "Million ","Billion ","Trillion ",};
        String ans="";
        while(n>0){
            int temp = (int)(n%1000);
            n=n/1000;
            int hundred=temp/100;
            StringBuilder str = new StringBuilder();
            str.append(firstTwenty[hundred]);
            if(hundred>0){
                str.append("Hundred ");
            }
            temp=temp%100;
            if(temp<=20){
                str.append(firstTwenty[temp]);
            }
            else{
                str.append(tens[temp/10]);
                str.append(firstTwenty[temp%10]);
            }
            word.add(str.toString());
        }
        StringBuilder finalanswer = new StringBuilder();
        while(word.size()>0){
            finalanswer.append(word.pop());
            finalanswer.append(multiplier[word.size()]);
        }

        return finalanswer.toString().trim();
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNextLong()) {
//            long input = scanner.nextLong();
//            System.out.println(castToSentence(input));
//        }
//        LargestSubarrayWith0Sum l = new LargestSubarrayWith0Sum();
//        int[] arr= new int[]{11,7,0,23};
//        System.out.print(l.maxLen(arr));

    }
}
