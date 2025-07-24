package test5;

import java.util.ArrayList;
import java.util.List;

// Member 클래스 정의
class Member {
    String id;
    String name;
    int age;

    // 생성자
    public Member(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 객체 정보 출력용 (toString 재정의)
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

// 메인 클래스는 Member 클래스 바깥에 정의되어야 함
public class test08 {
    public static void main(String[] args) {
        // Member 객체 생성
        Member m1 = new Member("a101", "김유신", 23);
        Member m2 = new Member("a102", "김춘추", 21);
        Member m3 = new Member("a103", "장보고", 33);

        // 리스트에 Member 객체 추가
        List<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);

        // 리스트 순회하며 멤버 정보 출력
        for (Member m : memberList) {
            System.out.println(m); // toString() 결과 출력
        }
    }
}
