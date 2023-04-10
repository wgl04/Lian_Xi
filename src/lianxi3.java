import java.util.Scanner;

public class lianxi3 {
    public static void Prints(){
        for (int i = 100; i < 1000; i++) {
            int j = i % 10;         //个位
            int k = i / 10 % 10;    //十位
            int l = i / 100;        //百位
            if (i==(j*j*j)+(k*k*k)+(l*l*l)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("打印1到1000内的符合水仙花的数");
        Prints();
    }
}
        


