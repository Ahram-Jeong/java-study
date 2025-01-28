package poly.ex.sender;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("페이스북 메시지 발송 : " + msg);
    }
}
