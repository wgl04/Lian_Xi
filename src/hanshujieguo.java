import java.util.Scanner;

public class hanshujieguo {
    public static void main(String[] args) {
        final double eps = 10e-7;
        Scanner wgl = new Scanner(System.in);
        System.out.println("请输入方程的系数a、b、c:");
        double a, b, c;
        a = wgl.nextInt();
        b = wgl.nextInt();
        c = wgl.nextInt();
        double d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.println("Two roots");
            double x1 = (-b + Math.sqrt(d) / (2 * a));//Math.sprt 平方跟
            System.out.println(x1);
            double x2 = (-b - Math.sqrt(d) / (2 * a));
            System.out.println(x2);
        }
        else if (d == 0)
        {
            System.out.println("One root");
            double x = -b / (2 * a);
            System.out.println(x);
        }
        else
        {
            System.out.println("No roots");
        }
    }
}
