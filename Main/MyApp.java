package Main;
import java.util.Scanner;

/**
 * calculator
 * 
 * 
 * @author (2018315036 양유석,2018315003 최세원, 2018315022 이지연) 
 * @version (20.06.12)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int old = sc.nextInt();
        boolean past = true;
        if( old >= 6 )
            past = true;
        else if (old <= 6)
            past = false;
        Calculation.Calculator c = new Calculation.Calculator();
        c.Calculator(age, past);
    }
}
