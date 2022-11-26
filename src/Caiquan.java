package CircleTest.src;

import java.util.Scanner;
public class Caiquan {
    public Caiquan ( ) {
    }
    
    public static void main( String[] args) {
            int computerWin = 0, peopleWin = 0;
            for (; ; ) {
                int computer = (int) (Math.random() * 3);
                Scanner input = new Scanner(System.in);
                System.out.println("rock(0), scissor(1), paper(2): ");
                int people = input.nextInt();
                if (people != 0 && people != 1 && people != 2) {
                    System.out.println("输入不合法");
                }
                if (computer == 0 && people == 1) {
                    computerWin += 1;
                } else if (computer == 0 && people == 2) {
                    peopleWin += 1;
                } else if (computer == 1 && people == 0) {
                    peopleWin += 1;
                } else if (computer == 1 && people == 2) {
                    computerWin += 1;
                } else if (computer == 2 && people == 0) {
                    computerWin += 1;
                } else if (computer == 2 && people == 1) {
                    peopleWin += 1;
                } else {
                    System.out.print("本局平手\t");
                }
                System.out.println("人类:计算机分数为：" + peopleWin + ":" + computerWin);
                if (computerWin == 3 || peopleWin == 3){
                    String str = (computerWin == 3) ? "计算机胜" : "人类胜";
                    System.out.println(str);
                    return;
                }
            }
        }
    }




