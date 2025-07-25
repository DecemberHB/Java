package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {

	private List<Account> accountList = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		System.out.println("프로그램 종료");
	}

	public void start() {
		boolean running = true;

		while (running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {
			case 1 -> createAccount();
			case 2 -> listAccounts();
			case 3 -> depositAccount();
			case 4 -> withdrawAccount();
			case 5 -> running = false;
			default -> System.out.println("올바른 번호를 입력하시오.");
			}
		}
	}

	public void printMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.프로그램 종료");
		System.out.println("------------------------------------------");
	}

	// 1. 계좌 생성
	public void createAccount() {
		System.out.println("--------------계좌 생성 ------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.print("계좌주: ");
		String owner = scanner.nextLine();

		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine();

		Account newAccount = new Account(ano, owner, balance);
		accountList.add(newAccount); // 리스트에 사용자 정보 및 초기 입금액 저장
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	// 2. 계좌 목록 조회
	public void listAccounts() {
		System.out.println("----------계좌 목록 ---------");
		for (Account acc : accountList) { // 리스트에 있는 사용자 정보 조회
			System.out.printf("%s   %s   %d\n", acc.getAno(), acc.getOwner(), acc.getBalance()); // Account에있는 생성자들 가져오기위해 get사용
																									 
		}
	}

	// 3. 예금 (if else)
	public void depositAccount() {
		System.out.println("----------예금---------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.print("예금액: ");
		int amount = scanner.nextInt(); // +@ 금액 변수 선언 및 입력
		scanner.nextLine();
		Account acc = findAccount(ano); // findAccount에 사용자가 입력한 ano을 매개변수로 입력
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount); // 기존에 저장된 Balanece 값을 변화 시키기 위해 get이아닌 set으로 들고와서 기존값(get)에 변수 추가
														
			System.out.println("결과 : 예금이 성공되었습니다. ");
		} else { // return 값으로 null을 받은 상태
			System.out.println("계좌가 존해하지 않습니다.");
		}
	}

	// 4. 출금 (if else)
	public void withdrawAccount() {
		System.out.println("----------출금---------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.print("출금액: ");
		int amount = scanner.nextInt();
		scanner.nextLine();

		Account acc = findAccount(ano);
		if (acc != null) {
			acc.setBalance(acc.getBalance() - amount);
			System.out.println("결과 : 출금이 성공되었습니다. ");
		} else {
			System.out.println("계좌가 존해하지 않습니다.");
		}
	}

	// 계좌번호 검사
	public Account findAccount(String ano) { // 사용자 입력값을 받았음
		for (Account acc : accountList) { // 기존 계좌생성으로 만들어진 리스트와 사용자 입력값 acc(ano)을 비교
			if (acc.getAno().equals(ano)) {
				return acc; // 비교해서 맞으면 그대로 전달
			}
		}
		return null; // 아니면 null 값 전달
	}
}
