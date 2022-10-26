package testnew;

import java.util.Scanner;
/**
 * &#064;program: ${PROGECT_NAME}
 * <p>
 * &#064;description: ${description}
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: ${YEAAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
 **/
public class Mainfirst {
    public static void main(String[] args) {
        System.out.println("编程练习\n-----------------------------------");
        Caculate_the_sum_of_odd_numbers_within_100();
        Calculate_100_in_terms_of_all_prime_numbers();
        The_maximum_and_minimum_values_in_the_output_data();
        Out_the_number_of_daffodils();
    }

    static void Caculate_the_sum_of_odd_numbers_within_100() {
/*
        //method_1:
            int res = 0;
        for (int i = 1; i <= 100; i++) {
            res += i;
        }
        System.out.println(res / 2);
*/
        //method_2
        int temp;
        int result = 0;
        for (int i = 1; i <= 50; i++) {
            temp = 2 * i - 1;
            result += temp;
        }
        System.out.println("*100之内的所有奇数之和：" + result);
    }

    static void Calculate_100_in_terms_of_all_prime_numbers() {
        System.out.println("*100以内的所有素数：");
        //输出从1到100之间所有的质数
        int n = 1;//声明变量n，判断是否换行
        // 质数是从2开始的，所以先遍历2到100的整数
        for (int i = 2; i <= 100; i++) {
            //声明变量j，遍历小于i的所有整数
            int j = 2;
            while (i % j != 0) {
                //如果i%j 余数不为0，则 自增，直到余数为0
                j++;
            }
            //如果余数为0，j为除了1之外最小的能被自己整除的整数，判断j是不是本身
            if (i == j) {
                //如果j等于i，输出i
                if (n % 5 != 0) {//判断是否换行
                    System.out.print(i + ",");//如果不是5的倍数，在同行输出
                } else {
                    System.out.println(i);//如果是5的倍数，换行输出
                }
                n++;
            }
        }
    }
         static void The_maximum_and_minimum_values_in_the_output_data() {
                     //输入一批整数，比较并输出最大值和最小值
                     //输入0时就结束循环
                     //声明变量
                     int max =0;        //最大整数
                     int min =0;        //最小整数
                     int aInteger ;    //一整数
                     Scanner input = new Scanner(System.in);
                     System.out.println("输入整数（输入0时结束）");
                     //从控制台获取————输入的整数
                     do{
                         aInteger = input.nextInt();
                         if(aInteger>max) {
                             //把输入的最大整数赋值给NumMax
                             max = aInteger;
                         }else if(aInteger<min) {
                             //把输入的最小整数赋值给NumMin，并且aInteger不为零
                             min = aInteger;
                         }
                     }while(aInteger !=0);
                     //aInteger不为0，继续循环
                     System.out.println("最大值："+max+"\t最小值："+min);
                 }
         static void Out_the_number_of_daffodils(){
                         System.out.println("*1000以内的水仙花数：");
                         for (int i = 1; i <=999; i++) {
                         int a = i%10;//个位
                         int b = i/10%10;//十位
                         int c = i/100; //百位
                         if(i == a*a*a+b*b*b+c*c*c) {
                             System.out.print(i+" ");
                         }
                     }
                 }
             }













