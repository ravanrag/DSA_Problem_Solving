package ArraysProblems.Leetcode7;

public class ReverseInteger {
    public int reverse(int x) {
        int sign=1;
        if(x<0){ //removing the negative sign and storing in sign variable
            sign=-1;
            x=x*-1; //making the number positive
        }

        long out=0l;
        while(x>0){
            out=(out*10)+x%10;
            x=x/10;
        }
        if(out >Integer.MAX_VALUE)
            return 0;
        return (int)(out*sign);
    }
}
