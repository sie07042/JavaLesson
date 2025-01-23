package basic.ctrl;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        //
        int kor;
        int eng;
        int math;
        int total;
        float avg;
        char grade;

        //사용자로부터  kor, eng, math 값을 입력 받습니다.(0 ~ 100점사이)
        //total을 구하여 저장하세요
        //avg(평균)을 구하여 저장하세요
        //구해진 avg 값에 따라서...
        //90포함 ~ 100이면 grade 는 'A',
        //80포함 ~ 89이면 grade 는 'B',
        //70포함 ~ 79이면 grade 는 'C',
        //60포함 ~ 69이면 grade 는 'D',
        //그 이하는 'D'

        //출력형식)
        //총점은 270점, 평균은 90.0점이고, A학점입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 >>> ");
        kor = sc.nextInt();

        System.out.print("영어 점수를 입력하세요 >>> ");
        eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 >>> ");
        math = sc.nextInt();

        total = kor + eng + math;
        avg = total / 3.0F; //실수와 정수의 연산 결과는 실수이다.

        if (avg >= 90.0F)
            grade = 'A';
        else if (avg >= 80.0F && avg < 90.0F)
            grade = 'B';
        else if (avg >= 70.0F && avg < 80.0F)
            grade = 'C';
        else if (avg >= 60.0F && avg < 70.0F)
            grade = 'D';
        else
            grade = 'F';

        System.out.printf("총점은 %d점, 평균은 %.1f점이고, %s학점입니다.\n",total,avg,grade);

        sc.close();
    }
}
