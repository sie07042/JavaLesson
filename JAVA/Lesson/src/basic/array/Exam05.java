package basic.array;

import java.util.Arrays;

public class Exam05 {
    public static void main(String[] args) {

        // 2차원 배열
//        int[][] dim2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int[][] dim2 = new  int[2][3];
        /* int[][] dim2 = {{1,2,3},{4,5,6}}; 2x3 */
        for (int i=0; i< dim2.length; i++) {
            for (int j = 0; j < dim2[i].length; j++) {
                dim2[i][j] = j+1+(i*3);
            }
        }

        for (int i=0; i< dim2.length; i++){
            for (int j=0; j< dim2[i].length; j++) {
                System.out.printf("%d",dim2[i][j]);
            }
            System.out.println(); //줄바꿈
        }
        System.out.println("dim2의 길이 : " + dim2.length);

        for (int[] arr : dim2) {
            System.out.println(Arrays.toString(arr));
        }

        // 2차원 배열을 문자열로 변환
        System.out.println(Arrays.deepToString(dim2));

        /*
        int[][] dim2 = new  int[][];
        * [10,20,30]
        * [40,50,60]
        * [70,80,90]
        * */
        // for문을 이용하여 데이터 생성

        int[][] arr2 = new int[3][3];

        for (int i=0; i< arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = ((j+1)+(i*arr2.length)) * 10;
            }
        }

       // for문을 이용하여 출력
        for (int i=0; i< arr2.length; i++) {
            for (int j=0; j< arr2[i].length; j++) {
                System.out.printf("%d ",arr2[i][j]);
            }
            System.out.println(); //줄바꿈
        }

        System.out.println(Arrays.deepToString(arr2));


        // 3차원 배열
//        int[][][] dim3 = {{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}}};
//        int[][][] dim3 = new int[2][2][3];
//        int[][][] dim3 = new  int[3][5][3];


    }
}
