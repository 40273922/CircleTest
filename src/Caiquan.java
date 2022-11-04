import java.util.Scanner;
public class Caiquan {
        public static void main(String[] args) {
            int computer_win = 0, people_win = 0;
            for (; ; ) {
                int computer = (int) (Math.random() * 3);
                Scanner input = new Scanner(System.in);
                System.out.println("rock(0), scissor(1), paper(2): ");
                int people = input.nextInt();
                if (people != 0 && people != 1 && people != 2) {
                    System.out.println("输入不合法");
                }
                if (computer == 0 && people == 1)
                    computer_win += 1;
                else if (computer == 0 && people == 2)
                    people_win += 1;
                else if (computer == 1 && people == 0)
                    people_win += 1;
                else if (computer == 1 && people == 2)
                    computer_win += 1;
                else if (computer == 2 && people == 0)
                    computer_win += 1;
                else if (computer == 2 && people == 1)
                    people_win += 1;
                else
                    System.out.print("本局平手\t");
                System.out.println("人类:计算机分数为：" + people_win + ":" + computer_win);
                if (computer_win == 3 || people_win == 3){
                    String str = (computer_win == 3) ? "计算机胜" : "人类胜";
                    System.out.println(str);
                    return;
                }
            }
        }
    }




