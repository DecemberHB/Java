package test5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Orange 클래스 정의
class Orange {
    private String country;
    private int price;

    public Orange(String country, int price) {
        this.country = country;
        this.price = price;
    }

    public void show() {
        System.out.println("원산지 : " + country + ", 가격 : " + price);
    }
}

public class test09 {
    public static void main(String[] args) {
        // map 선언 먼저
        Map<String, List<Orange>> map = new HashMap<>();

        // 첫 번째 리스트 (경기 지역)
        List<Orange> list1 = new ArrayList<>();
        list1.add(new Orange("파주", 3000));
        list1.add(new Orange("수원", 3000));

        // 두 번째 리스트 (충북 지역)
        List<Orange> list2 = new ArrayList<>();
        list2.add(new Orange("청주", 3000));
        list2.add(new Orange("충주", 3000));

        // 세 번째 리스트 (경남 지역)
        List<Orange> list3 = new ArrayList<>();
        list3.add(new Orange("밀양", 3000));
        list3.add(new Orange("함안", 3000));

        // Map에 각 지역 등록
        map.put("gyeonggi", list1);
        map.put("chungbuk", list2);
        map.put("gyungnam", list3);

        // Map에서 리스트 꺼내고 Orange 하나 꺼내서 출력
        List<Orange> list = map.get("gyeonggi");     // "gyeonggi" 지역의 리스트 가져오기
        Orange orange = list.get(0);                  // 첫 번째 오렌지 객체 가져오기
        orange.show();                                // 정보 출력
    }
}
