package test5;

public class test04 {
	
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java"; // .을 기준으로 해야함
		
		
		int idx = fileName.indexOf("."); // 그래서 indexOf "."
		String title = fileName.substring(0,idx); // 처음붜 idx까지 ( .) <<
		String ext = fileName.substring(idx); // idx부터 마지막까지
			
				
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92"; // 중간에 공백도 있어서 공백 처리도 해줘야함 _72 << _공백임
		String[] scores = strScores.split(", "); // 배열로 스플릿 , 구분자 ","
			// 1번째 방법 split 할떄 "," >>> ", " 
		  	// 2번쨰 방법 공백제거 .trim
				
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score); // 문자열을 기본 원시타입(int로 변환)
			//2번쨰방법
			//total += Integer.parseInt(score.trim()); // 문자열을 기본 원시타입(int로 변환)

		} 
		
		System.out.println("strScores 총점 : " + total);
		
	}

}
