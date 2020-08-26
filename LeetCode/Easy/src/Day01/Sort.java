package Day01;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] nums = {10,7,2,4,7,62,3,4,2,1,8,9,21};
        System.out.println("选择排序方法：\n1:选择排序\n2:冒泡排序\n3:插入排序\n4快速排序\n请输入:");
        String string = scanner.next();
        switch (string){
            case "1": sort1(nums); //选择排序
            break;
            case "2": sort2(nums);//冒泡
            break;
            case "3": sort3(nums);//插入
            break;
            case "4": sort4(nums,0,nums.length-1);//快速
            break;
            default:System.out.println("输入错误");
        }
        for (int a :nums){
            System.out.println(a);
        }
    }
    public static void sort1(int[] a){
        int len = a.length;
        for (int i=0;i<=len-2;i++){
            for(int j=i+1;j<=len-1;j++){
                if (a[j]<a[i]){
                    int tem = a[i];
                    a[i] = a[j];
                    a[j] = tem;
                }
            }
        }
    }
    public static void sort2(int[] a){
        int len = a.length;
        for (int i=0;i<len-1;i++){   //控制轮次
            for (int j=0;j<len-1-i;j++){   //具体交换
                if (a[j]>a[j+1]){
                    int tem = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tem;
                }
            }
        }

    }
    public static void sort3(int[] a){
        for (int i=1;i<a.length;i++){
            int tem = a[i];
            int leftindex = i-1;
            while ((leftindex>=0)&&(tem<a[leftindex])){
                a[leftindex+1] = a[leftindex];   //元素循环右移
                leftindex--;
            }
            a[leftindex+1] = tem;   //插入空位
        }
    }
    public static void sort4(int[] a, int left, int right){
        if (right<left){
            return;
        }
        int base= a[left];
        int tem,i=left,j=right;
        for (;j>=i;){
            if(i==j){
                break;
            }
            if(a[j]<=base){
                if(a[i]>=base&&i!=left){
                    tem = a[j];
                    a[j] = a[i];
                    a[i] = tem;
                    j--;    //此处不能j--;i++; j必须先移动
                }
                else {
                    i++;
                }
            }
            else {
                j--;
            }
        }
        tem = a[i];
        a[i] = a[left];
        a[left] = tem;
        sort4(a,left,i-1);
        sort4(a,i+1,right);
    }
}
