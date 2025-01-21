package poly.ex6;

/**
 * 하나의 클래스 여러 인터페이스
 */
public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("Tweet");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아요.");
    }
}
