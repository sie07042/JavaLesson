package basic;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        // Primitive Data Type
        // byte, short, char, int, long, float, double, boolean
        short age; // age 는 변수
        float height; // 키

        // Referenced Data Type
        String name = "홍길동"; // name은 객체(object), 인스턴스(instance)
        String gender = new String( "여자");


        String str = "a"; //문자열 객체
        char ch = 'a'; //문자형 변수

        // 시스템 입력장치를 오픈한다.
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 >>> ");
        name =  sc.nextLine(); // 문자열을 입력받아서 name에 저장한다.

        System.out.print("성별을 입력하세요 >>> ");
        gender = sc.nextLine();

        System.out.print("나이를 입력하세요 >>> ");
        age = sc.nextShort(); // short형 정수를 입력받는다.

        System.out.print("키를 입력하세요 >>> ");
        height = sc.nextFloat(); // float형 실수를 입력받는다.

        // 시스템 입력장치를 닫는다.
        sc.close();

        //String.format() 매소드(method)를 이용하여 새로운 문자열을 생성한다.
        str = String.format("이름 : %s, 성별 : %s, 나이 : %d, 키 : %.2f ", name, gender, age, height);
        System.out.println(str);
    }
}
