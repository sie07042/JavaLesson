package basic.array;

import java.util.Arrays;
import java.util.Random;

public class Exam07 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] lootto = new  int[6];
        for (int i=0; i <lootto.length; i++){
            lootto[i] = rand.nextInt(1,45);
        }

        System.out.println(Arrays.toString(lootto));

        // 배열 정렬하기
        Arrays.sort(lootto);

        System.out.println(Arrays.toString(lootto));
    }
}
