package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수 입력 >> ");
        int cnt = sc.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[cnt][subjects.length];

        for (int i = 0; i < cnt; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요.");
            for (int j = 0; j < cnt; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < cnt; i++) {
            int total = 0;
            for (int j = 0; j < subjects.length; j++) {
                total += scores[i][j];
            }
            double avg = (double) total / subjects.length;
            System.out.println((i + 1) + "번 학생의 총점 : " + total + ", 평균 : " + avg);
        }
    }
}
