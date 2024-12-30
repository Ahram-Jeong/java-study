package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("woodz", "chowoodz");
        member.print();
//        member.changeData("moodz", "Ash");
        member.changeData("Ash");
        member.print();
    }
}
