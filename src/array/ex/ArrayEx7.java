package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = {"조승연", "황민현", "김도훈", "박성호"};
        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[students.length][subjects.length];

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " 학생의 성적을 입력하세요.");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < subjects.length; j++) {
                total += scores[i][j];
            }
            double avg = (double) total / subjects.length;
            System.out.println(students[i] + " 학생의 총점 : " + total + ", 평균 : " + avg);
        }
    }
}
