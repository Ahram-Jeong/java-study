package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParam) {
//        this.nameField = nameParam;
        // 멤버변수와 매개변수가 다른 경우 this 생략 가능
        nameField = nameParam;
    }
}
