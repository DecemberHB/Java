package test5;

import java.util.Scanner;

class LoginException extends Exception { // 상속 받아야함(예외 상위)
	public LoginException(String msg) {
		super(msg);
	}

}

public class test03 {
	public static void main(String[] args) {
		String userId = "a101";
		String userPw = "abc1234";

		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("아이디 : ");
			String inputId = sc.nextLine();

			System.out.print("비밀번호 : ");
			String inputPw = sc.nextLine();

			if (!userId.equals(inputId)) { //문자열 비교 equals(userId)랑 내가 적은 inputId랑 비교
				throw new LoginException("아이디 틀림 ! ");
			} else if (!userPw.equals(inputPw)) {
				throw new LoginException("비밀번호 틀림 ! ");
			} else {
				System.out.println("로그인 성공");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
