package Main;
import java.util.Scanner;

/**
 * caculator를 실행시켜 DVD가격을 알려주는 메인메소드
 * 
 * 
 * @author (2018315036 양유석,2018315003 최세원, 2018315022 이지연) 
 * @version (20.06.12)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();
        System.out.println("DVD의 대여시작일을 입력하세요");
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
