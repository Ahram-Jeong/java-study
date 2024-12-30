package final1.ex;

public class Member {
    private final String id; // final 키워드 사용
    private String name;

    // 생성 시에만 id를 받아올 수 있고, 그 이후에는 변경 불가능
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

//    public void changeData(String id, String name) {
    public void changeData(String name) {
//        this.id = id; // 변경 불가, 컴파일 오류 발생
        this.name = name;
    }

    public void print() {
        System.out.println("id : " + id + ", name : " + name);
    }
}
