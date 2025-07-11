package test3;

public class BubbleSortTest {
	
	
	public static void arr(int data[]) {
		int n = data.length;
		
		for (int i=0; i<n-1; i++) {
			for(int j=0; j<n -1; j++) {
				if (data[j] > data [j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					
					
				}
			}
		}
	}
	

	
	public static void main(String[] args) {
		int[] data = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println("정렬전 배열");
		for(int num : data) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		
		arr(data);
		System.out.println("정렬 후 배열");
		for(int num : data) {
			System.out.print(num + " ");
		}
	}
}

