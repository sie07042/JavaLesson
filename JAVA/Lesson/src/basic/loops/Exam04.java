package basic.loops;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        // 정수를 입력받아서 해당 정수의 모든 약수를 구하시오
        // 약수 : 나누어 떨어지는 수
        // 약수이면 출력
        // 10
        // 1, 2, 5, 10
        // byte, short, int, long
        Scanner cs = new Scanner(System.in);
        // byte cs.nextByte();
        // short cs.nextShort();
        System.out.print("정수를 입력하세요 >>> ");
        int number =  cs.nextInt(); // 정수를 입력받아서 number에 저장

        // 정수를 입력받는다.
        // 반복문을 통하여 약수인지 체크하고
        // 약수이면 출력한다
        for(int i=1; i<=number; i++) {
            if (number % i == 0 )
                System.out.printf("%d의 약수 : %d\n", number, i);
        }

        cs.close();
    }
}
