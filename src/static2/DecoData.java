package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;
    
    public static void staticCall() {
//        instanceValue++; // 인스턴스 변수 접근 -> 컴파일 에러
//        instanceMethod(); // 인스턴스 메소드 접근 -> 컴파일 에러

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메소드 접근 가능
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메소드 접근 가능

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메소드 접근 가능
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
