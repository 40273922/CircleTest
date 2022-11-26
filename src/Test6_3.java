package CircleTest.src; /**
 * &#064;program: Test6_3
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-12 19:46
 */
import java.util.Scanner;

public class Test6_3 {
    public static void main(String[] args) {
        // 接收用户输入
        Scanner input = new Scanner(System.in);
        System.out.print("请您输入一个整数：");
        int user_input = Math.abs(input.nextInt());

        // 提前拦截输入为0
        if (user_input == 0){
            System.out.print("输入整数是0，是回文数");
            System.exit(1);
        }

        // 判断是否为回文数，并根据返回值确定输出内容
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
}
