package poly.ex5;

public class Cow implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("Moo");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}