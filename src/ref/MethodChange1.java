package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전 : a = " + a); // 10
        changePrimative(a);
        System.out.println("메소드 호출 전 : a = " + a); // 10
    }

    static void changePrimative(int x) {
        x = 20;
    }
}
