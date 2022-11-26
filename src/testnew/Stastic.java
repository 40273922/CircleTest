package CircleTest.src.testnew;

import java.util.Scanner;
/**
* &#064;program: Shop
* <p>
* &#064;description:
* <p>
*&#064;author:XieMu
* <p>
*&#064;create: -10-26 10:36
**/ public class Stastic{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                System.out.print("Enter an integer, the input ends if it is 0: ");
                int integer, positive, negative;
                double sum;
                sum = positive = negative = 0;
                do {
                    integer = input.nextInt();
                    if (integer > 0) positive++;
                    if (integer < 0) negative++;
                    sum += integer;
                } while (integer != 0);
                if (positive == 0 && negative == 0)
                    System.out.println("No numbers are entered except 0");
                else {
                    System.out.println("The number of positives is " + positive + "\nThe number of negatives is " + negative + "\nThe total is " + sum + "\nThe average is " + (sum / (positive + negative)));
                }
        }
    }
