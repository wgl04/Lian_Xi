import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lianxi2 {
    public static void main(String[] args) throws IOException {
        final double eps =10e-7;
        double a, b, c;
         a = Double . parseDouble ( new BufferedReader( new InputStreamReader( System.in ) ) . readLine( ) ) ;
         b = Double . parseDouble ( new BufferedReader( new InputStreamReader( System.in ) ) . readLine( ) );
         c = Double . parseDouble ( new BufferedReader( new InputStreamReader( System.in ) ) . readLine( ) ) ;
        double d = b * b - 4 * a * c;
        if ( d > 0 ) {
            System.out.println ( "Two roots " ) ;
            double x1 = (-b + Math . sqrt ( d ) ) / ( 2 * a ) ;
            double x2 = (-b - Math . sqrt ( d ) ) / ( 2 * a ) ;
            System.out.println ( x1 ) ;
            System.out.println ( x2 ) ;
        } else
        if ( d == 0 ) {
            System.out.println ( "One root " ) ;
            double x = -b / ( 2 * a ) ;
            System.out.println ( x ) ;
        } else
        System.out.println ( "No roots " ) ;
    }
}
