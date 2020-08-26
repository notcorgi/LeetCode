package Day02;

public class Solution28 {
    public static void main(String[] args) {
        String string1="qwert";
        String string2="rt";
        System.out.println(strStr(string1,string2));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        for (int i=0;i<(haystack.length()-needle.length()+1);i++){
            int index = i;
            for (int j=0;j<needle.length();j++){
                if (haystack.charAt(index)==needle.charAt(j)){
                    index++;
                }
                else break;
                }
            if (index==i+needle.length()){
                return i;
            }
        }
        return -1;
    }
}
