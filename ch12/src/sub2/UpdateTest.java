package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 
 * 날짜 : 2025/07/25 
 * 이름 : 박효빈 내용 
 * : 자바 Update 실습하기
 * 
 */
public class UpdateTest {

	public static void main(String[] args) {
		
		
		// DB 정보 
		String host = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소 체계 반드시 지킬것
		String user = "hyokong";
		String pass = "1234";
		
		
		try {
		
			// 데이터 베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			//SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			// SQL 실행
			String sql = "UPDATE USER1 SET AGE=35 WHERE USER_ID='J101'"; //쿼리 중요
			stmt.execute(sql);
			//결과처리(SELECT일떄)
			
			
			//데이터베이스종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료 ...");
	}
}
