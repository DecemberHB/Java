package test5;

import java.util.List;

public class test06 {
	public static void main(String[] args) {
		printList(createList());
	}
	
	
	public static void printList(List<Integer> scoreList) {
		int total = 0;
		int size = scoreList.size();
		
		for(int i=0; i<size; i++) {
			int score = scoreList.get(i);
			total += score;
			System.out.println(score);
		
			if(i == size -1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
			
		}
		System.out.println(total);
	}

}


/*
 * 
 * 60 ~ 100까지의 수 10개 뽑고
 * 그걸 리스트 안에 넣고
 * 사이즈만큼*/
