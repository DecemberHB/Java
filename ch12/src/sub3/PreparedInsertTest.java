package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 
 * 날짜 : 2025/07/25 이름 : 박효빈 내용 : PreparedInsert 실습하기
 * 
 */
public class PreparedInsertTest {
	public static void main(String[] args) {
		
		// DB 정보
				final String HOST = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소 체계 반드시 지킬것
				final String USER = "hyokong";
				final String PASS = "1234";
				
				try {
					
					// 데이터베이스 접속
					Connection conn = DriverManager.getConnection(HOST,USER,PASS);
					
					// SQL 실행객체 생성 ( PrepareStatement)
					// 쿼리 파라미터 형태 String sql = "INSERT INTO USER1 VALUSE (?,?,?,?)";

					String sql = "INSERT INTO USER1 VALUSE (?,?,?,?)"; //쿼리 파라미터를 사용한 SQL(준비된 쿼리)
					PreparedStatement psmt = conn.prepareStatement(sql);
					
					// 각 쿼리피라미터를 바인딩
					psmt.setString(1, "P101"); 
					psmt.setString(2, "김유신");
					psmt.setString(3, "010-1222-3333");
					psmt.setInt(4, 35);
					
					// SQL 실행
					psmt.executeUpdate(); // INSERT, DELETE, UPDATE는 executeUpdate
					
					// 결과처리(SELECT 경우)
					
					
					// 데이터베이스 종료
					psmt.close();
					conn.close();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Insert 완료...");

	}
}
