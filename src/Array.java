package CircleTest.src;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("输入一串数字");
//        int[] t = new int[10];
//        for (int i = 0; i < t.length; i++) {
//            t[i] = in.nextInt();
//        }
//        zuz(t);
//        sum(t);
//        ji(t);
//        jj(t);
//        jl(t);
//        jb(t);
//                int[][] array = new int[4][4];
//                for (int i = 0 ; i < 4 ; i++){
//                    for (int j = 0 ; j < 4; j++){
//                        array[i][j] = (int)(Math.random()*2);
//                        System.out.print(array[i][j]);
//                    }
//                    System.out.println();
//                }
//                int largest_row = 0;
//                int count_row = 0;
//                int temp_row = 0;
//                for (int i = 0 ; i < 4 ; i++){
//                    temp_row = 0;
//                    for (int j = 0 ; j < 4; j++){
//                        if (array[i][j] == 1){
//                            ++temp_row;
//                        }
//                    }
//                    if (count_row < temp_row){
//                        count_row = temp_row;
//                        largest_row = i;
//                    }
//                }
//                int largest_col = 0;
//                int count_col = 0;
//                int temp_col = 0;
//                for (int j = 0 ; j < 4 ; j++){
//                    temp_col = 0;
//                    for (int i = 0 ; i < 4; i++){
//                        if (array[i][j] == 1){
//                            ++temp_col;
//                        }
//                    }
//                    if (count_col < temp_col){
//                        count_col = temp_col;
//                        largest_col = j;
//                    }
//                }
//                System.out.println("The largest row index: " + largest_row);
//                System.out.println("The largest column index: " + largest_col);
                Scanner input = new Scanner(System.in);
                System.out.print("请您输入一个整数：");
                int user_input = Math.abs(input.nextInt());
                if (user_input == 0){
                    System.out.print("输入整数是0，是回文数");
                    System.exit(1);
                }
                boolean bool = isPalindrome(user_input);
                if (bool)
                    System.out.print("输入整数是回文数");
                else
                    System.out.print("输入整数不是回文数");
            }
            // 判断输入数值是否为回文数
            public static boolean isPalindrome(int number){
                return number == reverse(number);
            }
            // 返回number的回文数
            public static int reverse(int number){
                String str = "";       // 临时保存转换后的数字（以String型存储）
                for (;number > 0;number /= 10){
                    str += number % 10;
                }
                return Integer.parseInt(str);
            }


    @Contract("_ -> param1")
    public static int @NotNull [] zuz(int @NotNull [] t) {
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
    @Contract("_ -> param1")
    public  static  int[] sum(int @NotNull [] t){
        int sum=0;
        System.out.println("数组求和：");
        for (int i = 0; i< t.length ; i++) {
            sum=sum+t[i];
        }
        System.out.println(sum);
        return t;
    }
    @Contract(value = "_ -> param1", pure = true)
    public  static  int[] ji(int @NotNull [] t) {
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
                @Contract(pure = true)
                public static int comp(int num, int @NotNull [] t){
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
             @Contract("_ -> param1")
             public static  int[] jb(int @NotNull [] t) {
                 int count = 0;
                 int count2 = 0;
                 for (int i = 1; i < t.length; i++) {
                     if (t[i] % 2 == 0) {
                         count++;
                     } else {
                         count2++;
                     }
                 }
                 System.out.println();
                 System.out.println("偶数的个数为：" + count + "个，" + "奇数的个数为：" + count2 + "个");
                 return t;
             }
}








