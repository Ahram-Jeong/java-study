package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("Max Volume. 음량을 증가할 수 없습니다.");
        } else {
            volume += 10;
            System.out.println("+10 Volume Up");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("Volume : " + volume);
    }
}
