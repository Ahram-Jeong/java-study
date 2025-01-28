package poly.ex.sender;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("이메일 발송 : " + msg);
    }
}
