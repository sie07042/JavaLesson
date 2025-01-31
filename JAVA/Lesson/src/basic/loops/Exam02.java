package basic.loops;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {

        // do ~ while( 조건식 );
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.print("문자열을 입력하s세요(bye를 입력하면 종료됩니다.) >>>");
            str = sc.nextLine();    // 키보드로부터 문자열을 입력받아서 str에 저장한다.
            System.out.printf("입력한 문자열 : %s\n", str);

        } while ( !str.equals("bye") ); // str.equals("bye")==false

        sc.close();
    }
}
