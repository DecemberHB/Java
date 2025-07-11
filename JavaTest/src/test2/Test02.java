package test2;
/* 날짜 : 2025/07/10
 * 이름 : 박효빈
 * 내용 : 자바 배열 최대값 찾기 연습문제
 * */
public class Test02 {
	
	public static void main(String[] args) {
		int arr[] = { 17, 92, 18, 33, 58, 7, 26, 42};
		int maxNum = arr[0];
		
		for (int i = 0; i<8; i++) {
			if (maxNum<arr[i]) { // 해당 원소보다 작다면 maxNum과 바꿔줌
				maxNum = arr[i];
			}
		}
		
		System.out.println("배열 arr에서 가장 큰 수 : "+maxNum);
	}

}
