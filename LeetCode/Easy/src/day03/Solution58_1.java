package day03;

public class Solution58_1 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" qwe rewrew "));
    }

    public static int lengthOfLastWord(String s) {
        if (s==null)
            return 0;
        int len=s.length();
        int index=-1;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)!=' '&&index==-1){
                index=i;
            }
            if(index!=-1&&s.charAt(i)==' '){
                return index-i;
            }

    }
        return index+1;
}
}
