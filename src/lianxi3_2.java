import java.util.Scanner;

public class lianxi3_2 {
    public static void main(String[] args) {
        int x;
        int t,num = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int n = x;
        System.out.println(x +"逆序输出各个位数字");
        do {
            t = n % 10;
            System.out.println(t +" ");
            n = n /10;
            num++;
        }while (n > 0);
        System.out.println();
        System.out.println(x +"是"+ num +"位数字");
    }
}
