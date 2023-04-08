import java.util.Scanner;

public class lianxi2_1 {
    private static double sqrt(double d){
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个数:");
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        double c =sc.nextDouble();
        double d = b * b - 4 * a * c;
        double x1 = -b - sqrt(d) / (2 * a);
        double x2 = -b - sqrt(d) / (2 * a);
        if(d > 0){
            System.out.println("有俩个解");
            System.out.println(x1);
            System.out.println(x2);
        } else if (d == 0)
        {
            System.out.println("有一个解");
            System.out.println(x1);
        }else{
            System.out.println("无解");
        }
    }

}
