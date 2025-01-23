package basic;

public class Operators {
    //Entry Point (프로그램 진입점)
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        //연산자
        //1. 산술 연산자 : +, -, *, /, %(나머지), ++(1씩증가), --(1씩 감소)
        //2. 대입 연산자 : =, +=, -=, *=, /=, %=
        num1 = 10;
        num2 = 3;
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        num3 = num1 + num2;
        System.out.println("num1 + num2 = " + num3);
        num3 = num1 - num2;
        System.out.println("num1 - num2 = " + num3);
        num3 = num1 * num2;
        System.out.println("num1 * num2 = " + num3);
        num3 = num1 / num2;
        System.out.println("num1 / num2 = " + num3);
        num3 = num1 % num2; //나머지 연산
        System.out.println("num1 % num2 = " + num3);

        //실수형 변수를 선언
        float fNum;
        fNum = num1 / (float)num2; //형변환 (TYpe Casting)
        System.out.println("num1 / num2 = " + fNum);

        //num1 = num1 + 1;

        // 증강 연산자 ++, --
        System.out.printf("num1 : %d\n", num1);
        System.out.printf("num1 : %d\n", num1++); //post-fix : 같은줄에 사용된 명령을 먼저 실행하고 난 뒤 증가
        System.out.printf("num1 : %d\n", num1++);
        System.out.printf("num1 : %d\n", ++num1); //pre-fix : 변수의 값을 먼저 증가한 뒤 같은 줄에 있는 명령을 실행

        System.out.printf("num1 : %d\n", num1);
        System.out.printf("num1 : %d\n", num1--);
        System.out.printf("num1 : %d\n", num1--);
        System.out.printf("num1 : %d\n", --num1);

        // 2. 대입 연산자 : =, =+, -=, *=, /=, %=
        num3 += num1; //num3 = num3 + num1;
        num3 -= num1; //num3 = num3 - num1;
        num3 *= num1; //num3 = num3 * num1;
        num3 /= num1; //num3 = num3 / num1;
        num3 %= num1; //num3 = num3 % num1;

        //형변환
        short shNum = (short) num1; //명시적 형변환, overflow 가 발생할 수 있고, 그 책임은 개발자에게 있다.
        num1 = shNum; //묵시적 형변환

        //3. 관계(비교) 연산자 : >, <, >=, <=, ==, !=
        num1 = 10;
        num2 = 5;
        boolean bOk = num1 > num2;
        System.out.println("num1 > num2 : " + bOk);

        bOk = num1 < num2;
        System.out.println("num1 < num2 : " + bOk);

        bOk = num1 <= num2;
        System.out.println("num1 <= num2 : " + bOk);

        bOk = num1 >= num2;
        System.out.println("num1 >= num2 : " + bOk);

        bOk = num1 == num2;
        System.out.println("num1 == num2 : " + bOk);

        bOk = num1 != num2;
        System.out.println("num1 != num2 : " + bOk);

        //4. 논리 연산자 : &&(AND), ||(OR), ?(NOT)
        bOk = num1 > num2 && num1 == num2;
        System.out.println( "bOk : " + bOk);

        bOk = num1 < num2 || num1 != num2;
        System.out.println( "bOk : " + bOk);

        bOk = !(num1 < num2);
        System.out.println("bOk : " + bOk);

        //5. 비트 연산자 : &(and), |(or), ~(not), ^(xor), <<, >> (shift)
        num1 =5;
        num2 =3;
        num3 = num1 & num2;
        System.out.println("num3 : " + num3);
        num3 = num1 | num2;
        System.out.println("num3 : " + num3);
        num3 = ~num1;
        System.out.println("num3 : " + num3);

        // ^(xor) : 두개의 비트가 같으면 0, 다르면 1로 세팅된다.
        num3 = num1 ^ num2;
        System.out.println("num3 : " + num3);

        // shift
        num3 = num1 << 1; // num1의 비트를 왼쪽으로 한칸 이동시킴
        System.out.println("num3 : " + num3);

        num3 = num1 >> 1; // num1의 비트를 오른쪽으로 한칸 이동시킴
        System.out.println("num3 : " + num3);

        //6. 기타 연산자 : +, (조건식) ? 참일때값 : 거짓일때값 ===> 삼항 연산자
        num3 = (num1==5) ? 1 : 0;
    }
}
