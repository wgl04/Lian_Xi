public class lianxi3_1 {
    public static void main(String[] args) {
        int i , j;
        int sum = 0;
        for (i = 1;i < 1000;i++){
            for (j =1;j < i;j++){
                int a = i % j;
                if (a == 0)
                    sum = sum + j;
            }
            if (sum==i)
                System.out.println(i +"是完数，它的因子是: " );
            sum=0;
        }
    }
}
