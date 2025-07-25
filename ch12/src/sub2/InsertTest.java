package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * 날짜 : 2025/07/25 이름 : 박효빈 내용 : 자바 Insert 실습하기
 * 
 */
public class InsertTest {

		
	public static void main(String[] args) {
		// DB 정보 
		String host = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소 체계 반드시 지킬것
		String user = "hyokong";
		String pass = "1234";
		
		Connection conn = null; // finally에서도 써야하니깐 여기서선언

		try {
			// 데이터베이스 접속
			 conn = DriverManager.getConnection(host,user,pass);

			
			// SQL 실행 객체 생성

			Statement stmt = conn.createStatement();
			// SQL 실행
			// SQL문 작성
			String sql = "INSERT INTO USER1 VALUES ('J102','김유신','010-1212-2221','30')";
			stmt.executeUpdate(sql); // 실행
			
			// 결과처리 (SELECT 문 일 경우)
			// INSERT ~ UPDATE 나오지않으니깐 현재 실습에서는 제외
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 데이터베이스 종료
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Insert 완료 ...");
	}
}
