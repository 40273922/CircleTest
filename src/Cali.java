package CircleTest.src;

import java.util.Calendar;
import java.util.Scanner;
    public class Cali {
        public Cali ( ) {
        }
    
        public void start( Calendar cal){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入年份：");
            int year = sc.nextInt();
            System.out.print("请输入月份：");
            int month = sc.nextInt()-1;
            cal.set(year,month,1);
            int temp = cal.get(Calendar.DAY_OF_WEEK)-1;
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            for(int i = 1; i <= temp; i++ ){
                System.out.print("\t");
            }
            for(int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++){
                System.out.print(i + "\t");
                if((i+temp)%7 == 0){
                    System.out.println();
                }
            }
        }
        public static void main(String[] args) {
            Calendar cal = Calendar.getInstance();
            new Cali().start(cal);
        }
    }


