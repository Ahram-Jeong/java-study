package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        // 향상된 for 문, for-each 문
        for (int num : nums) {
            System.out.println(num);
        }

        // for-each 문을 사용할 수 없는 경우 -> 증가하는 idx 값이 필요할 때
        for (int i = 0; i < nums.length; i++) {
            System.out.println("No." + i + "의 결과는 : " + nums[i]);
        }
    }
}
