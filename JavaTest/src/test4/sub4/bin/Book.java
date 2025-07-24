package test4.sub4.bin;

public class Book {
	private String title; //책제목
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}
	
	public void borrowBook() {
		if(this.isBorrowd  == false) {
			isBorrowd = true;
			System.out.println("대출 가능 .. isBorrowd : True");
			
		}else{
			System.out.println("대출 중 .. isBorrowd : Flase");

		}
		
	}
	
	public void returnBook() {
		if(this.isBorrowd == true) {
			isBorrowd = false;
		}
		
	}
	public void getBookInfo() {
		System.out.println("책 제목 : " + title);
		System.out.println("저자    : " + author);
		System.out.println("ISBN : " + isbn);
		System.out.println("도서대출 여부 : " + (isBorrowd ? "불가능" : "가능"));
		
	}
	
	public String getTitle() {
		return title;
	}

}
