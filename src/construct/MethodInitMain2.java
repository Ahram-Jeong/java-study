package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "조승연", 28, 100);

        MemberInit member2 = new MemberInit();
        initMember(member2, "황민현", 29, 90);

        MemberInit[] members = { member1, member2 };

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age + ", 성적 : " + member.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
