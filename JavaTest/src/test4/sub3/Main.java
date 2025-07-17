package test4.sub3;

public class Main {

	public static void main(String[] args) {

		MovieTicket movieTicket = new MovieTicket("타이타닉", "19:00", "A1");
		
		movieTicket.printTicketInfo();
		System.out.println("---------------------");
		
		movieTicket.bookTicket();
		System.out.println("---------------------");

		movieTicket.printTicketInfo();
		System.out.println("---------------------");

		movieTicket.bookTicket();
		System.out.println("---------------------");

		movieTicket.cancelBook();
		System.out.println("---------------------");

		movieTicket.printTicketInfo();
		System.out.println("---------------------");

		movieTicket.cancelBook();
		System.out.println("---------------------");

	}
}
