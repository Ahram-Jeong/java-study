package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 정수의 갯수 입력 >> ");
        int cnt = sc.nextInt();

        int[] nums = new int[cnt];
        int sum = 0;
        double avg;

        System.out.println(cnt + "개의 정수 입력");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        avg = (double) sum / cnt;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
