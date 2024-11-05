package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("조승연", 28, 100);

        MemberInit member2 = new MemberInit();
        member2.initMember("황민현", 29, 90);

        MemberInit[] members = { member1, member2 };

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age + ", 성적 : " + member.grade);
        }
    }
}
