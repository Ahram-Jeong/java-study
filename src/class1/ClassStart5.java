package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "조승연";
        student1.age = 28;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "황민현";
        student2.age = 29;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + ", 나이 : " + students[i].age + ", 성적 : " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student std = students[i];
            System.out.println("이름 : " + std.name + ", 나이 : " + std.age + ", 성적 : " + std.grade);
        }

        for (Student std : students) {
            System.out.println("이름 : " + std.name + ", 나이 : " + std.age + ", 성적 : " + std.grade);
        }
    }
}
