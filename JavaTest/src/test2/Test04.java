package test2;
/* 날짜 : 2025/07/10
 * 이름 : 박효빈
 * 내용 : 자바 배열 선택정렬 연습문제
 * */
public class Test04 {

	public static void main(String[] args) {
		int arr[] = {4,2,1,5,3};
		
		for (int i=0; i<4; i++) {
			for (int j = i +1; j<5; j++) {
				if (arr[i] > arr[j]) { //i = 0, j = 1 / 
					int temp = arr[j]; //temp에 arr[1]의 값을 저장 ** 핵심 부분 
					arr[j] = arr[i];
					arr[i] = temp; // 다시 arr[0]에 보관해둔 temp 대입
				}
			}
		}
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
}
