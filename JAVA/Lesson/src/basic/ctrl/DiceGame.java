package basic.ctrl;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

  //      String str = "a";
        char ch ='a';
        short sh = 65;
        System.out.printf("%c\n",sh);     //
        System.out.printf("%c\n",++sh);     //
        System.out.printf("%c\n",++sh);     //

        //난수값을 발생시켜 주는 객체
        Random rand =new Random();

        int com = rand.nextInt(1,7); //1~6(7-1)사이의 값을 무작위로 생성
        System.out.printf("컴퓨터의 숫자는 %d입니다.\n당신 차례입니다\n",com);

        Scanner sc= new Scanner(System.in);
        sc.nextInt(); //엔터키를 입력해야 다음 처리를 할 수 있도록 대기상태를 만든다.

        int user = rand.nextInt(1,7);
        // 당신의 숫자는 x입니다

        //com과 user의 값을 비교하여
        //com이 크면 "컴퓨터 승리"
        //user가 크면 "사용자 승리"
        //같으면 "비겼습니다"를 출력하세요

        if (com >= user){
            System.out.printf("당신의 숫자는 %d 입니다.\n컴퓨터의 승리입니다.\n",user);
        } else if (com == user) {
            System.out.printf("당신의 숫자는 %d 입니다.\n비겼습니다.\n",user);
        }else if (com <= user) {
            System.out.printf("당신의 숫자는 %d 입니다.\n사용자의 승리입니다.\n",user);
        }


    }
}
