import java.util.Scanner;
public class Dfs {
    public static void main(String[] args) {
        int n , t , i, k;
        Scanner cin = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        n = cin.nextInt();
        k = n;
        for (i = 0; i < n; i++) {
            for (int j = k - 1; j > 0; j--) {
                System.out.print(" ");
            }for (t = i + 1; t > 0; t--) {
                System.out.print(t);
            }for (int p = 1; p < i + 1; p++) {
                System.out.print(p + 1);
            }System.out.println();
            k -= 1;
        }
    }
}