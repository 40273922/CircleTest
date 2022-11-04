import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一串数字");
        int[] t = new int[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = in.nextInt();
        }
        zuz(t);
        sum(t);
        ji(t);
        jj(t);
        jl(t);
    }
    public static int[] zuz(int[] t) {
        int max = t[0];
        int min = t[0];
        int i = 0;
        for (i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
            if (t[i] < min) {
                min = t[i];
            }
        }
        System.out.println("最大值是" + max);
        System.out.println("最小值是" + min);
        return t ;
    }
    public  static  int[] sum(int[] t){
        int sum=0;
        System.out.println("数组求和：");
        for (int i = 0; i< t.length ; i++) {
            sum=sum+t[i];
        }
        System.out.println(sum);
        return t;
    }
    public  static  int[] ji(int[] t) {
        int count = 0;
        for (int i = 1; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                count++;
            }
        }
        return t;
    }
        public  static  int[] jj(int[] t){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("请输入一个整数：");
                    int num = scanner.nextInt();
                    int com = comp(num,t);
                    if(com>=0) {
                        System.out.println("此数字在数组中的下标为："+com);
                    }else {
                        System.out.println("此数字在数组中不存在："+com);
                    }
            return t;
        }
                public static int comp(int num,int[] t){
                    int flag = -1;
                    for (int i = 0; i < t.length; i++) {
                        if (num==t[i]){
                            flag=i;
                            return flag;
                        }
                    }
                    return flag;
                }
             public static  int[] jl(int[] t){
                 Arrays.sort(t);
                 for (int i :t) {
                     System.out.print(i + " ");
                 }
                 System.out.println();
                 return t;
             }
            }








