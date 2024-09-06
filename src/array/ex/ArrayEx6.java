package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 정수의 갯수 입력 >> ");
        int cnt = sc.nextInt();

        int[] nums = new int[cnt];
        int min, max;

        System.out.println(cnt + "개의 정수 입력");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        min = nums[0];
        max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }
}
