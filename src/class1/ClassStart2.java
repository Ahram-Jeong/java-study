package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"조승연", "황민현", "박성호", "김도훈"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrades = {80, 90, 70, 95};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + ", 나이 : " + studentAges[i] + ", 성적 : " + studentGrades[i]);
        }
    }
}
