package poly.ex5;

/**
 * 인터페이스는 모든 메소드가 추상 메소드
 * 인터페이스는 메소드 이름만 있는 설계도이고, 이 설계도가 실제 어떻게 작동하는지는 하위 클래스에서 모두 구현햐애 함 (필수)
 */
public interface InterfaceAnimal {
    void sound(); // public abstract 생략된 형태
    void move(); // public abstract 생략된 형태
}
