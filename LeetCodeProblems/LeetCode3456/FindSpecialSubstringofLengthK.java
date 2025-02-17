package LeetCodeProblems.LeetCode3456;

public class FindSpecialSubstringofLengthK {
    public boolean hasSpecialSubstring(String s, int k) {
        int n=s.length();
        int count=1;
        char c=' ';
        for(int i=0;i<n;i++){

            if(s.charAt(i)==c){
                count++;
            }
            else{
                c=s.charAt(i);
                count=1;
            }
            char next =' ';
            if(n>i+1) next = s.charAt(i+1);
            if(count==k && c!=next) return true;
        }
        return false;

    }
}
