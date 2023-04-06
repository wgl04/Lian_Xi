import java.util.Scanner;

public class lianxi {
    public static void main(String[] args) {

        int number = 0;//number数字
        int blank = 0;//blank空格
        int letters = 0;//letters字母
        int other = 0;//other其他
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一串字符:");
        String a= scanner.nextLine();
            for (int i = 0;i < a.length();i++)
            {
                char ch = a.charAt(i);
                if(ch >='0' && ch <='9')
                {
                    number++;
                }
                else if(ch == ' ')
                {
                    blank++;
                }
                else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                {
                    letters++;
                }
                else {
                    other++;
                }

            }

        System.out.println("数字: "+number);
        System.out.println("字母: "+letters);
        System.out.println("空格: "+blank);
        System.out.println("其他: "+other);
    }

}
