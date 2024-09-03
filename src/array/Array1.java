package array;

public class Array1 {
    public static void main(String[] args) {
        // 배열 생성과 초기화
        int[] students = {90, 80, 70, 60, 50};
//        int[] students = new int[]{90, 80, 70, 60, 50}; // 동일

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 점수 : " + students[i]);
        }
    }
}
