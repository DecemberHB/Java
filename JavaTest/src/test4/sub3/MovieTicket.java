package test4.sub3;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle,String screenTime,
			String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
		
	}
	
	public void bookTicket() {
		if(isBooked == false) {
			isBooked = true;
			System.out.println(this.movieTitle + this.screenTime+this.seatNumber+"예매 완료");
		} else {
			System.out.println("이미 예약된 자리");
		}
		
	}
	
	public void cancelBook() {
		if(isBooked == true) {
			isBooked = false;
			System.out.println(this.movieTitle + this.screenTime + this.seatNumber+ "취소 완료");
		}else {
			System.out.println("아직 예약하지 않았음");
		}
	}
	
	public void printTicketInfo() {
		System.out.println("영화 제목 : " + movieTitle);
		System.out.println("상영 시간 : " + screenTime);
		System.out.println("좌석 번호 : " + seatNumber);
		System.out.println("예매 여부 : " + (isBooked ? "Yes" : "No")); //삼항연산자
	}

}
