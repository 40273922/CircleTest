/**
 * &#064;program: Zimishu
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-28 10:01
 **/

public class Zimishu{

    public static void main(String[] args) {
        for (int n =1; n <= 999999; n++ ){

            int count = 0;
            int tmp = n;

            while (tmp != 0){  //判断数字n的位数
                count++;
                tmp = tmp/10;
            }

            tmp = n;

            int sum = 0;
            while (tmp != 0 ) {

                sum += Math.pow(tmp%10,count); // tmp%10计算每位上的数字,count是每位数字的次幂数

                tmp = tmp/10;
            }


            if(sum == n && count==4)
                System.out.println(sum+"是四叶玫瑰数");
            if(sum == n && count==5)
                System.out.println(sum+"是五角星数");


        }
    }
}
