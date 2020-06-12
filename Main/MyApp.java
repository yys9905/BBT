package Main;
import java.util.Scanner;

/**
 * caculator를 실행시키는 메인메소드
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
        boolean past;
        if( old >= 6 )
            past = true;
        else
            past = false;
        Calculation.Calculator c = new Calculation.Calculator();
        c.Calculator(age, past);
    }
}
