package poly.basic;

/**
 * upcasting vs downcasting
 * 업캐스팅은 생략할 수 있다. 다운캐스팅은 생략할 수 없다.
 * 참고로 업캐스팅은 매우 자주 사용하기 때문에 생략을 권장한다!
 */
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;  // 업캐스팅을 생략 가능, 생략 권장
        Parent parent2 = child; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
