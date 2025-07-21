package sub4;

/*
 * 날짜 : 2025/07/21
 * 이름 : 박효빈
 * 내용 : 자바 Wrapper 클래스 실습하기
 * 
 * */
public class WrapperTest {

	public static void main(String[] args) {
		// ** 중요 파트 **
		// 기본타입(primitive)
		int var1 = 1;
		double var2 = 2.1;
		boolean var3 = true;

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);

		// Wrapper 포장(boxing) (객체로 만듦)
		Integer box1 = var1;
		Double box2 = var2;
		Boolean box3 = var3;

		System.out.println("box1 : " + box1);
		System.out.println("box2 : " + box2);
		System.out.println("box3 : " + box3);

		// 문자열 -> 기본 타입 변환

		String str1 = "1";
		String str2 = "2.1";
		String str3 = "false";

		int value1 = Integer.parseInt(str1); // static 메서드 (parserInt)
		double value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);

		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

		// 문자열 -> Wrapper 타입 변환
		Integer w1 = Integer.valueOf(str1);
		Double w2 = Double.valueOf(str2);
		Boolean w3 = Boolean.valueOf(str3);

		// Wrapper -> 문자열 변환
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();

		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);
		System.out.println("s3 :" + s3);

		// Wrapper -> 기본 타입 변환
		int v1 = w1; // 자동으로 언박싱 된 상태 Auto un-boxing
		double v2 = w2;
		boolean v3 = w3;

		// 기본타입 -> Wrapper 변환
		Integer wr1 = v1; // Auto Boxing
		Double wr2 = v2;
		Boolean wr3 = v3;
	}
}
