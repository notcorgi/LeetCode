package Day02;

public class Solution14 {
    public static void main(String[] args) {
        String[] strings = {"aa","a"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs) {
        String string ="";
        if (strs.length==0){
            return string;
        }
        if (strs.length==1){
            return strs[0];
        }
        int len = strs[0].length();
        int len1 = strs.length;
        for (int i=0;i<len;i++){
            for (int j=1;j<len1;j++){
                if (i>=strs[j].length()||strs[0].charAt(i)!=strs[j].charAt(i)){
                    return string;
                }
            }
            string = string+strs[0].charAt(i);
        }
        return string;
    }
}
