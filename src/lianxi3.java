public class lianxi3 {
    public static void Prints() {
        for (int i = 100;i < 1000;i++){
            int n = i % 100;
            int m = i / 10 % 10;
            int a = i / 100;
            if (i == (n * n * n)+(m * m * m)+(a * a * a)){
                System.out.println(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("打印1到1000内的符合水仙花的数");
        Prints();
    }
}
