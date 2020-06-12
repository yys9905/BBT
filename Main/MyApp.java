package Main;
import java.util.Scanner;

/**
 * calculator
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int old = sc.nextInt();
        boolean past;
        if( old >= 6 )
            past = true;
        else
            past = false;
        Calculation.Calculator c = new Calculation.Calculator();
        c.Calculator(age, past);
    }
}
