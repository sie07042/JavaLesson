package basic;

import java.util.Scanner;

public class Exam05 {

    public static void main(String[] args) {
        // Scanner object declared before use
        Scanner sc = new Scanner(System.in);

        System.out.println("지역코드를 입력하세요 >>> ");
        int code = sc.nextInt();  // Read user input

        String local;  // Declare the 'local' variable

        switch (code) {
            case 1:
                local = "서울";
                break;
            case 2:
                local = "경기도";
                break;
            case 3:
                local = "강원도";
                break;
            case 4:
                local = "경상도";
                break;
            case 5:
                local = "전라도";
                break;
            case 6:
                local = "제주도";
                break;
            case 7:
                local = "해외";
                break;
            default:
                local = "알 수 없음";  // Default case if code is not valid
                break;
        }

        // Print the result using printf for formatting
        System.out.printf("입력한 코드 %d는 %s입니다\n", code, local);
    }
}
