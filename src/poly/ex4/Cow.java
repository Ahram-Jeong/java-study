package poly.ex4;

public class Cow extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("Moo");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
