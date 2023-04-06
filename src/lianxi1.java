import java.util.Scanner;

public class lianxi1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("请输入要判断数");
        int i = x.nextInt();
        int n = 0;
        for (n = 2; n <= i - 1; n++){
        if(i % n == 0){
            System.out.println(i +"不是素数");
            break;
        }
         }
        if(n == i){
            System.out.println(i +"是素数");
        }
    }

}
