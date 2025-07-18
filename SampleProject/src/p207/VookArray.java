package p207;

import java.util.Scanner;

class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
public class VookArray {
	public static void main(String[] args) {
		Book[] book = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<book.length; i++) {
			System.out.print("제목 >>");
			String titleString = scanner.nextLine();
			System.out.print("저자 >>");
			String author = scanner.nextLine();
			book[i] = new Book(titleString, author);
		}
		for (int i=0; i<book.length; i++) {
			System.out.println("(" + book[i].title + ", " + book[i].author + ")" );
		}
	}

}
