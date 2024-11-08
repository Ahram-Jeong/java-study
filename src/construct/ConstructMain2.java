package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("조승연", 28, 100);
        MemberConstruct member2 = new MemberConstruct("황민현", 29);

        MemberConstruct[] members = { member1, member2 };

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age + ", 성적 : " + member.grade);
        }
    }
}
