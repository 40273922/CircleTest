package CircleTest.src;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

/**
 * &#064;program: Cale
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-03 17:01
 * @author GK_L2
 */
public class Cale {
    @Contract ( pure = true )
    public Cale ( ) {
    }
    
    public static class Calendar {
        @Contract ( pure = true )
        public Calendar ( ) {
        }
    
        public static void main( String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入年份（1900——2099）：");
            int year = input.nextInt();
            int total = 0;//统计总天数
            final  String weekHead ="日\t一\t二\t三\t四\t五\t六";
            if(year>=1900&&year<=2099){
                boolean  isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
                int[]aa=new int[isLeapYear?366:365];//创建数组
                //统计天数
                for (int i = 1900; i < year; i++) {
                    total += ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) ? 366 : 365;
                }
                total%=7;
                //将星期几存入数组中，每一天都对应了星期几
                for (int i = 0; i <aa.length ; i++,total++) {
                    total%=7;
                    aa[i]=total;
                }
                // 输出每个月的日历
                int count=0;
                for (int i = 1; i <=12 ; i++) {
                    System.out.println("\n       "+year+"年"+i+"月");
                    System.out.println(weekHead);
                    int maxday = 0;
                            switch (i) {
                                //判断月份的最大天数
                                case 2 : maxday=isLeapYear ? 29 : 28;
                                break;
                                case 4:maxday= 30;
                                    break;
                                case 6:maxday= 30;
                                break;
                                case 9:maxday= 30;
                                    break;
                                    case 11 : maxday= 30;
                                break;
                                default :maxday= 31;
                    }
                    for (int j = 0; j <=aa[count] ; j++) {
                        if((aa[count]+1)%7==0) {
                            break;
                        } else{
                            System.out.print("\t");
                        }
                    }
                    for (int j = 1; j <=maxday ; j++) {
                        System.out.print(j+"\t");
                        if((aa[count]+1+j)%7==0&&j!=maxday){
                            System.out.println();
                        }
                    }
                    count+=maxday;
                }
            }else {
                System.out.println("年份输入有误，请重试");
            }
        }
    }
}
