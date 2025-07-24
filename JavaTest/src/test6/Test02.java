package test6;

public class Test02 {
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 0; i < 7; i++) {
			if (i <= 3) // i = 0
				count++; // count = 1
			else
				count--;
			for (int j = 1; j < 5 - count; j++) // j = 1 ,  3 번 반복
				System.out.print("☆");
			for (int k = 1; k< (2*count) ; k++)
				System.out.print("★");
			for (int j = 1; j < 5 - count; j++)
				System.out.print("☆");
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}

// i = 0 , count = 1 , j = 1 ☆☆☆ 4  5 - count(1) 
// i = 1 , count = 2 , j = 2 ☆☆
// i = 2 , count = 3 , j = 3 ☆
// i = 3 , count = 4 , (공백)
// i = 4,  count = 3 , j = 4 ☆

// 7x = 3y 2xcount 2 + 1?