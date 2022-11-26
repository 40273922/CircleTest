package CircleTest.src;

import java.util.Scanner;

/**
 * &#064;program: Dowhile
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-28 08:40
 **/
public class Dowhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎使用MyShopping管理系统\n\n");
        System.out.println("********************************");
        System.out.println("1.客 户 信 息 管 理\n2.购 物 信 息\n3.真 情 回 顾\n4.注 销");
        System.out.println("********************************\n\n");
        int a;
        System.out.println("请选择，输入数字：");
        a = scan.nextInt();
        do {
                System.out.println("输入错误，请重新输入数字：");
                a = scan.nextInt();
            if(a>0&&a<5){
            System.out.println("执行客户信息管理");
            break;
            }
        } while (a>4||a<0);
    }
    }

// while(a>4){
//         a =scan.nextInt();
//
//
//         }