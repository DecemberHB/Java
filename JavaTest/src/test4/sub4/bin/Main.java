package test4.sub4.bin;

public class Main {

	public static void main(String[] args) {

		// 도서 생성
		Book book = new Book("자바 프로그래밍", "많이 지음", "101-111-111");
		
		// 회원 생성
		Member member = new Member("스타벅스", "star114");
		
		// 도서 정보 출력
		book.getBookInfo();
		
		// 회원 정보 출력
		member.getMemberInfo();
		
		// 도서 대출
		member.borrowBook(book);
		
	}

}
