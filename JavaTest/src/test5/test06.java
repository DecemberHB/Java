package test5;

import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test06 {
	public static void main(String[] args) {
		// 60 ~ 100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		printList(createList());
	}

	// 점수 리스트를 출력하고 총합 계산
	public static void printList(List<Integer> scoreList) {
		int total = 0;
		int size = scoreList.size();

		for (int i = 0; i < size; i++) {
			int score = scoreList.get(i);
			total += score;

			System.out.print(score);
			if (i == size - 1) {
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
		}

		System.out.println(total);
	}

	// 점수 리스트 생성
	public static List<Integer> createList() { // 반환타입을 보고 생각하기
		List<Integer> scoreList = new ArrayList<>(); // 제네릭 타입은 숫자니깐 Interger << 기본형int 취급 X
		Random rand = new Random();

		for (int i = 1; i <= 10; i++) {
			// 60 ~ 100 사이 임의의 수
			int num = rand.nextInt(41) + 60; // 0~40 + 60 → 60~100
			scoreList.add(num);
		}

		return scoreList;
	}
}
