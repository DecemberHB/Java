package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;

/**
 * 
 * 날짜 : 2025/07/25 이름 : 박효빈 내용 : PreparedInsert 실습하기
 * 
 */
public class PreparSelectTest {

	public static void main(String[] args) {

		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소 체계 반드시 지킬것
		final String USER = "hyokong";
		final String PASS = "1234";
		
		// 조회 결과 반환용 리스트 생성
		
		List<User1VO> users = new ArrayList<User1VO>();

		try {
			// 데이터베이스 접속

			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			// SQL 실행 객체 생성(PreparedStatenent)
			String sql = "SELECT * FROM USER1 WHERE AGE >= ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1,20); // 1번째 쿼리피라미터 (?)에 나이 숫자 20 바인딩
			
			// SQL 실행

			ResultSet rs = psmt.executeQuery(); // SELECT 실행하기 때문에 executeQuery() 로 실행해야 ResultSet 반환됨
			
			// 결과처리

			while(rs.next()) {
				
				//VO 객체 생성 : VO 객체는 데이터베이스에서 조회된 결과를 
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
				
			}
			// 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//리스트 출력
		for(User1VO user : users) {
			System.out.println(user);
		}

		System.out.println("Select 완료 ...");
	}

}
