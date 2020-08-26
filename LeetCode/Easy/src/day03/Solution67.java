package day03;

public class Solution67 {
    public static void main(String[] args) {
        System.out.println(addBinary("110","111"));
    }
    public static String addBinary(String a, String b) {
        StringBuffer stringBuffer=new StringBuffer();
        int alen=a.length(),blen=b.length();
        int len = alen>=blen? alen:blen;
        int flag=0;
        for(int i=0;i<len;i++){
            int c=i<alen?a.charAt(alen-i-1)-'0':0;
            int d=i<blen?b.charAt(blen-i-1)-'0':0;
            stringBuffer=stringBuffer.insert(0,(char)((c+d+flag)%2+'0'));//存储当前位置
            flag=(c+d+flag)/2;  //代表是否进位
        }
        if(flag==1){  //若有进位
            stringBuffer.insert(0,(char)(1+'0'));
        }
        return stringBuffer.toString();
    }
}
