import java.util.Scanner;
public class Shop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购买的商品编号：");
        System.out.println("1.T恤" + "\t" + "2.网球鞋" + "\t" + "3.网球拍" + "\t");
        System.out.println("**************************************************");
        char flag = 'y';
        int number = 0;
        int id = 0;
        String tmp;
        double sum = 0;
        int count = 0;
        while(flag == 'y'){
            System.out.print("请输入商品编号：");
            id = sc.nextInt();
            System.out.print("请输入购买数量：");
            number = sc.nextInt();
            count += number;
            switch(id){
                case 1:
                    System.out.println("T恤￥245.0" + "\t" + "数量 " + number + "\t" + "合计 ￥" + (245.0 * number));
                    sum += 245.0 * number;
                    break;
                case 2:
                    System.out.println("网球鞋￥570.0" + "\t" + "数量 " + number + "\t" + "合计 ￥" + (570.0 * number));
                    sum += 570.0 * number;
                    break;
                case 3:
                    System.out.println("网球拍￥320.0" + "\t" + "数量 " + number + "\t" + "合计 ￥" + (320.0 * number));
                    sum += 320.0 * number;
                    break;
                default:
                    System.out.println("商品编号输入有误，请确认是否重新输入！");
            }
            System.out.print("是否继续y/n:");
            tmp = sc.next();
            flag = tmp.charAt(0);
        }
        sum = sum * 0.8;
        System.out.print("折扣：0.8" + "\n" + "应付金额：" + sum + "\n" + "实付金额：");
        double money = sc.nextDouble();
        while(sum > money){
            System.out.print("您输入的金额小于应付金额，请重新输入：");
            money = sc.nextDouble();
        }
        System.out.println("找钱：" + (money - sum));
    }
}
//import java.util.Scanner;
//
///**
// * &#064;program: Shop
// * <p>
// * &#064;description:
// * <p>
// * &#064;author:XieMu
// * <p>
// * &#064;create: -10-28 10:16
// **/
//public class Shop {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("选择购买的商品编号：\n");
//        System.out.println("1.T 恤\n2.网球鞋\n3.网球拍");
//        System.out.println("********************************************\n\n");
//        System.out.print("请输入商品编号：");
//        System.out.print("请输入商品编号：");
//        int bian = s.nextInt();
//        System.out.println("请输入购买数量：");
//        int shu = s.nextInt();
//        String ans;
//        switch (bian) {
//            case 1:
//                System.out.print("T 恤￥245 ");
//                jisuan(245, shu);
//                System.out.println("是否继续（y/n）:");
//                k();
//                break;
//            case 2:
//                System.out.print("网球鞋");
//                jisuan(245, shu);
//                System.out.println("是否继续（y/n）:");
//                k();
//                break;
//            case 3:
//                System.out.print("网球拍");
//                jisuan(245, shu);
//                System.out.println("是否继续（y/n）:");
//                k();
//                break;
//            default:System.out.println("请输入正确的编号");
//        }
//        while (k().equals("y"))  {
//            System.out.print("请输入商品编号：");
//             bian = s.nextInt();
//            System.out.println("请输入购买数量：");
//             shu = s.nextInt();
//
//            switch (bian) {
//                case 1:
//                    System.out.print("T 恤￥245 ");
//                    jisuan(245, shu);
//                    System.out.println("是否继续（y/n）:");
//                    k();
//                    break;
//                case 2:
//                    System.out.print("网球鞋");
//                    jisuan(245, shu);
//                    System.out.println("是否继续（y/n）:");
//                    k();
//                    break;
//                case 3:
//                    System.out.print("网球拍");
//                    jisuan(245, shu);
//                    System.out.println("是否继续（y/n）:");
//                    k();
//                    break;
//                default:
//            }
//        }
//    }
//    public  static  void jisuan (double a,double b){
//        double heji =a*b;
//        System.out.println("数量 "+b+" 合计 ￥"+heji);
//    }
//    static String k () {
//        Scanner s2 = new Scanner(System.in);
//
//        return s2.next();
//    }
//}
