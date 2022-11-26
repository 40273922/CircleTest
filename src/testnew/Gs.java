package CircleTest.src.testnew;

import java.util.Scanner;

/**
 * &#064;program: Gs
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-02 10:16
 **/
public class Gs {
    public static void main(String[] args) {
//        f();
//        ff();
//        fff();
//        ffff();
//        double i =(8+sqrt(8));
//        System.out.println(i);
//          IsPr(1000);
//        conti2();
        ds();
    }

    public static void f(){
        Scanner s = new Scanner(System.in);
        System.out.println("输入一个值：");
        int a = s.nextInt();
        for(int i=0;i<a;i++){
            System.out.println(a-i+"+"+i+"="+a);
        }
    }
    public static void ff(){
        int sum=0;
        for (int i =1;i<=100;i++){
            if(i%3!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static void fff() {
        Scanner s2 = new Scanner(System.in);
        int a,a2,z;
        int count = 0;
        StringBuilder str2= new StringBuilder();
        for (int i = 0; i < 5; i++) {
            a = (int) (Math.random() * 10);
            a2 = (int) (Math.random() * 10);
            System.out.print(a + "+" + a2 + "=");
            z = s2.nextInt();
            String str1 =a + "+" + a2 + "="+z;
            if (z == (a + a2)) {
                count++;
                str2.append(str1).append(" correct").append("\n");
            } else {
                str2.append(str1).append(" wrong").append("\n");
            }
        }
        System.out.println("您花了" + System.currentTimeMillis() + "毫秒做对了" + count + "道题");
        System.out.println(str2);
    }
    public  static void ffff(){
        Scanner input=new Scanner(System.in);
        int i;
        int a;
        double small=0;
        double large=0;
        for (i=1;i<=10;i++){
            System.out.println("第"+i+"位的顾客年龄是：");
            a= input.nextInt();
            if (a<30){
                small++;
            }else {
                large++;
            }
        }
        large=large/10;
        small=small/10;
        System.out.println("30岁以下的人所占的比例："+small);
        System.out.println("30岁及以上的人所占的比例："+large);
    }
    public static double sqrt(double A ){
                    double Xo = 1;
                    do{
                        Xo = Xo-(Xo*Xo-A)/(2*Xo);
                    }while (!((Xo*Xo-A)<1E-323));
        return Xo;
    }
    public static void IsPr(int n) {
        System.out.println("Prime numbers between 1 and 100");
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " \n");
            }
        }
    }
    public static void conti(){
        int cou =0;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                continue;
            }
            cou+=i;
        }
        System.out.println(cou);
    }
    public static void conti2(){
        for(int i=0;i<3;i++){
            Scanner s = new Scanner(System.in);
            System.out.print("请输入会员号（<4位帧数>）：");
            int num = s.nextInt();
            System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
            String bir = s.next();
            System.out.print("请输入会员积分：");
            int num2 = s.nextInt();
            if (num<1000||num>9999) {
                System.out.println("客户号"+num+"是无效会员号！\n录入信息失败");
                continue;
            }

            System.out.println("你输入的会员信息是：\n"+num+" "+bir+" "+num2+"\n");
        }
    }
    public static void ds(){
                for(int i=1;i<=9;i++) {
                    for(int j=1;j<=i;j++)
                        System.out.print(i+"*"+j+"="+ i*j +"\t");
                    System.out.println();
                }
            }
        }

