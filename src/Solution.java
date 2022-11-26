package CircleTest.src;

/**
 * &#064;program: Solution
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-10 16:29
 */
public class Solution {
        public static void main(String[] args){
            System.out.println(isPlindrome(12321));
        }
        static boolean isPlindrome(int x){
            int temp = 0;
            int num = x;
            int num3 = x;
            int i = 0;
            int p = 0;
            int num2 = 0;
            while(num > 0){
                num /= 10;
                i++;
            }
            p = i;
            for(int j = 1;j <= i;j++){
                num2 = (num3 / (int)(Math.pow(10,p- 1)) %10);
                temp += num2 * (int)(Math.pow(10,j-1));
                p--;
            }
            return temp == x;

        }
    }

