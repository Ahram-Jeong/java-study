package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double num = 1.5;
//        printNumber(num); 컴파일 오류 발생
        printNumber((int) num); // 명시적 형변환
    }

    public static void printNumber(int i) {
        System.out.println("숫자 : " + i);
    }
}
