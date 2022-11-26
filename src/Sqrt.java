package CircleTest.src;

/**
 * &#064;program: Sqrt
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-03 02:59
 */
public class Sqrt{
    public static void main(String[]args){}
    public static double sqrt(double A){
        double Xo=1;
        do{
            Xo=Xo-(Xo*Xo-A)/(2*Xo);
        }while (!((Xo*Xo-A)<1E-323));
        return Xo;
    }
}
