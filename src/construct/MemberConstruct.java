package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 : name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 추가
    
    /*
    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }
    **/

    MemberConstruct(String name, int age) {
        // this() : 생성자 내부에서 자신의 생성자 호출 가능
        // 규칙 : this()는 생성자 코드의 첫 줄에만 작성할 수 있다.
        this(name, age, 50); // 변경
    }
}
