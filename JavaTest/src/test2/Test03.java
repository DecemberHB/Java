package test2;
/* 날짜 : 2025/07/10
 * 이름 : 박효빈
 * 내용 : 자바 배열 역순 정렬 출력 연습문제
 * */
public class Test03 {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		//현재 배열 출력
		for(int i = 0; i<10; i++) {
			System.out.print(arr[i]+" ,");
		}
		
		System.out.print("\n");
		
		

		//역순 정렬 첫번째 원소와 마지막 원소, 두번째와 9번째 자리 변환하여 정렬 t
		for (int j=0; j<5; j++) {
			int temp = arr [j]; //temp에 1을 보관해놓는거
			arr[j] = arr[9-j]; // 빈자리에 끝자리 정수 넣고
			arr[ 9 - j] = temp; // 다시 그 끝자리 빈자리에 아까 보관해둔 temp 넣기
		}
		
		//역순으로 정렬된 배열 출력
		for(int n : arr) {
			System.out.print(n+", ");
		}
		
	}

}
