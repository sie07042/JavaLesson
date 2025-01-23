package basic.ctrl;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        // avg : 실수값으로 입력받아서 (0.0 ~ 100.0)

        float avg = 100f;
        char grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("평균을 입력하세요 >>> ");
        avg = sc.nextFloat();

        int div = (int)(avg / 10);
        switch (div) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        //출력 : 평균 95.1점은 A학접 입니다.
        System.out.printf("평균 %.1f점은 %s학점 입니다.\n",avg,grade);


        //grade값에 따라서...
        //'A'이면 "완전 우수한 학생입니다."
        //'B'이면 "보통 우수한 학생입니다."
        //'C', 'D'이면 "보통 학생입니다, 노력이 필요합니다."
        //'F'이면 "처절한 노력이 팔요합니다"
        // 를 출력하세요

        String local = "";

        switch (grade){
            case 'A':
                local = "완전 우수한 학생입니다.";
                break;
            case 'B':
                local = "보통 우수한 학생입니다.";
                break;
            case 'C':
            case 'D':
                local = "보통 학생입니다, 노력이 필요합니다.";
                break;
            default:
                local = "처절한 노력이 팔요합니다";
        }

        System.out.print(local);

        sc.close();
    }
}
