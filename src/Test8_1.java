package CircleTest.src; /**
 * &#064;program: Test8_1
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-12 19:50
 */
import java.util.Scanner;

public class Test8_1 {
    public static void main(String[] args) {

        double[][] m = new double[3][4];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int a = 0 ; a < 3 ; a++){
            for (int b = 0 ; b < 4 ; b++){
                m[a][b] = input.nextDouble();
            }
        }

        int columnIndex = 0;

        double result = 0;

        for (columnIndex = 0 ; columnIndex < 4 ; columnIndex++){

            result = sumColumn(m, columnIndex);

            System.out.print("Sum of the elements at column " + columnIndex + " is " + result + "\n");
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){

        int row = m.length;
        double sum = 0;

        for (int i = 0 ; i < row ; i++){
            sum += m[i][columnIndex];
        }

        return sum;
    }
}
