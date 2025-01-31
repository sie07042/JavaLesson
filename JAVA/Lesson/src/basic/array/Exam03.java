package basic.array;

public class Exam03 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5,6,7,9,10,22,31,55,32,43,63};
        for(int number : nums) {
            System.out.printf("%d",number );
        }
        System.out.println(); //줄바꿈

        for (int i=0; i< nums.length; i+=2){
            System.out.printf("%d", nums[i]);
        }
    }
}
