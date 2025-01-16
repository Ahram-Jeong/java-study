package poly.ex3;

/**
 * 추상 메소드는 메소드 바디가 없음
 * 따라서 작동하지 않는 메소드를 가진 불완전한 클래스
 * 그러므로 인스턴스로 직접 생성하지 못하도록 추상 클래스로 선언해야 함
 */
public abstract class AbstractAnimal {
    // 추상 메소드
    public abstract void sound();

    // not abstract method, 오버라이딩 하지 않아도 됨
    public void  move() {
        System.out.println("동물이 움직입니다.");
    }
}
