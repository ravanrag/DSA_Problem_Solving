package LeetCodeProblems.LeetCode8;

public class StringToInteger {
    public int myAtoi(String s) {
        int i=0, length=s.length(), sign=1;
        long ans=0;
        char[] c = s.toCharArray();
        while(i<length && c[i]==' '){
            i++;
        }
        if(i<length && (c[i]=='+' || c[i]=='-')){
            if(c[i]=='-')
                sign=-1;
            i++;
        }
        while(i<length && c[i]>='0' && c[i]<='9'){
            int digit=c[i]-'0';
            ans=ans*10+digit;
            if(ans*sign>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(ans*sign<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int)(ans*sign);
    }
}
