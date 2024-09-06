package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        double avg;

        System.out.println("5개의 정수 입력");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        avg = (double) sum / nums.length;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
