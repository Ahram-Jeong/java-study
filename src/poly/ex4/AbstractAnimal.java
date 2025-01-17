package poly.ex4;

/**
 * 순수 추상 클래스 : 실행 로직을 전혀 가지고 있지 않음
 * 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공
 *
 * 특징
 * 1. 인스턴스를 생성할 수 없다.
 * 2. 상속 시, 자식은 모든 메소드를 오버라이딩 해야 한다.
 * 3. 주로 다형성을 위해 사용된다.
 */
public abstract class AbstractAnimal {
    // 추상 메소드
    public abstract void sound();
    public abstract void  move();
}
