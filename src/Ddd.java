package CircleTest.src;

import java.util.Scanner;
/**
 * @author GK_L2
 */
public class Ddd {
    public Ddd ( ) {
    }
    
    public boolean isleap( int year) {
            return (year % 4 == 0) && (year % 100 != 0) || year % 400 == 0;
        }
        public int daysOfmonth(int year, int month) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (isleap(year))
                        return 29;
                    else
                        return 28;
                default:
                    System.out.println("程序错误：输入的月份有误!");
                    return 0;
            }
        }
        private int weekOffirst(int year, int month) {
            int m = month;
            int d = 1;
            if (month <= 2) { /* 对小于2的月份进行修正 */
                year--;
                m = month + 12;
            }
            int y = year % 100;
            int c = year / 100;// 世纪数减1
            int w = (y + y / 4 + c / 4 - 2 * c + (13 * (m + 1) / 5) + d - 1) % 7;
            if (w < 0) /* 修正计算结果是负数的情况 */
                w += 7;
            return w;
        }
        public void dataprint(int year, int month) {
            System.out.println("\t\t" + year + "年" + " " + month + "月");
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            int week = weekOffirst(year, month);
            int[][] data = new int[6][7];
            int daynum = 1;
            for (int i = 0; daynum <= daysOfmonth(year, month); i++) {
                for (int j = 0; j < 7 && daynum <= daysOfmonth(year, month); j++) {
                    if (i == 0 && j < week) {
                        data[i][j] = 0;
                        System.out.print("\t");
                    } else {
                        data[i][j] = daynum++;
                        System.out.print(data[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Ddd du = new Ddd();
            Scanner scn = new Scanner(System.in);
            System.out.print("输入年:");
            int year = scn.nextInt();
            System.out.print("输入月:");
            int month = scn.nextInt();
            scn.close();
            du.dataprint(year, month);
        }
    }