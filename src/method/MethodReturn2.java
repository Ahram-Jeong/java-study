package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
    }
    
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "세, 미성년자 출입 불가능");
            return;
        }

        System.out.println(age + "세, 출입 가능");
    }
}
