package test5;

import java.util.HashSet;   // 중복을 허용하지 않는 Set 인터페이스 구현체
import java.util.Set;       // Set 인터페이스
import java.util.TreeSet;   // 정렬을 제공하는 Set 구현체

public class test07 {
    public static void main(String[] args) {
        // 5번 반복해서 로또 번호 출력 (즉, 5게임)
        for (int count = 1; count <= 5; count++) {
            System.out.println(makeLotto()); // 6개의 로또 번호 생성 후 출력
        }
    }

    // 로또 번호 6개를 무작위로 생성하고 정렬한 후 반환하는 메서드
    public static Set<Integer> makeLotto() {

        // HashSet은 중복 허용하지 않음 + 순서는 보장되지 않음
        Set<Integer> lottoSet = new HashSet<>();

        for (;;) { // 무한 루프 (조건이 없으므로 break 될 때까지 반복)
            // 1부터 45까지의 정수 중 하나를 랜덤하게 생성
            int num = (int) Math.ceil(Math.random() * 45);
            // 랜덤한 숫자를 Set에 추가 (중복일 경우 자동으로 무시됨)
            lottoSet.add(num);

            // Set의 사이즈가 6이 되면 루프 종료
            if (lottoSet.size() == 6) {
                break;
            }
        }

        // TreeSet은 Set이면서 자동 정렬 기능을 제공
        // HashSet의 데이터를 TreeSet으로 옮기면 자동으로 오름차순 정렬됨
        Set<Integer> treeSet = new TreeSet<>(lottoSet);
        return treeSet; // 정렬된 결과 반환
    }
}
