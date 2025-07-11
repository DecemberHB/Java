package test2;

import java.util.Scanner;

/* 날짜 : 2025/07/10
 * 이름 : 박효빈
 * 내용 : 자바 배열 이진탐색 출력 연습문제 **
 * */
public class Test05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = {5, 10, 18, 22, 35, 55, 75, 103, 152};
		
		System.out.print("검색할 값 입력 : "); // 중간값을 먼저 찾음(이진탐색)
		int value = scanner.nextInt();
		
		int start =0;
		int end = arr.length -1;
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			int mid = (start + end)/2; // start 0 + 8 / 2 => mind = 4 22 / 5값 비교
			if(arr[mid] > value) {
				end = mid - 1; //중간값보다 내가 찾고자한것보다 크다면 ? 왼쪽을 버림 start가 + 1로 변해야함 왼쪽을 버려야하니깐 
			}else if(arr[mid] < value) { //작다면? 오른쪽을 버려야함으로써 -1이 되어야함
				start = mid +1 ;
			}else {
				loc = mid;
				state = true;
				break;
			}
		}
		if(state) {
			System.out.printf("찾은 위치 : %d번째 있습니다.", loc + 1 );
		}else {
			System.out.println("찾는 숫자가 없습니다." + state);
		}
		scanner.close();
	}

}
