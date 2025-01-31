package basic;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        /*
         * 지하철 요금 계산기
         * 나이에 따라 지하철 요금을 계산해주세요
         * 나이가
         * 0~7살 사이면 요금은 0원입니다.
         * 8살 이상 ~ 13살 이하이면 요금은 1000원입니다.
         * 14살 이상 ~ 64살 이하이면 요금은 1500원입니다.
         * 65살 이상이면 요금은 0원입니다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력하세요 >>> ");
        int age = sc.nextInt(); // 입력받은 나이

        int money = 0;  // 요금 초기화

        // 나이에 따라 요금 계산
        if (age >= 65) {
            money = 0;
        } else if (age >= 14 && age <= 64) {
            money = 1500;
        } else if (age >= 8 && age <= 13) {
            money = 1000;
        } else if (age <= 7) {
            money = 0;
        }

        // 결과 출력 (printf를 사용하여 형식에 맞게 출력)
        System.out.printf("%d살의 지하철 요금은 %d원 입니다\n", age, money);

        sc.close();  // Scanner 객체 닫기
    }
}
