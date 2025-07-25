package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 날짜 : 2025/07/25 이름 : 박효빈 내용 : 자바 Select 실습하기
 * 
 */


public class SeleteTest {

	public static void main(String[] args) {

		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소 체계 반드시 지킬것
		final String USER = "hyokong";
		final String PASS = "1234";
		
		// 조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<>();

		try {
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			
			// SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "SELECT * FROM USER1";
			ResultSet rs = stmt.executeQuery(sql); // SELECT문의 executeQuery() <<< *!* 실행하고 ResultSet 반환 !!! << 
			
			// 결과처리 *****('일반적으로' 리스트 생성 )
			// Cursor 사용 1번 내려가는게 next > 이후에 1,2,3,4 
			while(rs.next() ) { // Corsor를 다음 Row로 이동시킴, 이동할 Row가 없으면 flase 
				// 커서가 가리키는 Row의 각 컬럼값을 추출 1번째 줄의 ---- <<<< 요거임
				
				/*
				String user_id = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				// 위 4개를 객체로 생성해야됨 ! 클래스 생성해놨음
				
				
				//ㅁ 모두 set으로 불러와야함 화면에 봐야하니깐 
				User1VO vo = new User1VO();
				vo.setUser_id(user_id);
				vo.setName(name);
				vo.setHp(hp);
				vo.setAge(age);
				*/
				
				
				// 위 4개를 객체로 생성해야됨 ! 클래스 생성해놨음
				
				User1VO vo = new User1VO(); // 현재의 것을 리스트로 만들어야함
				vo.setUser_id( rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4)); // 맨위에 리스트 생성해놓음
				
				// 리스트 삽입
				users.add(vo);
				
			}
			
			// 데이터베이스 종료
			rs.close();
			stmt.close();
			conn.close();
			
			
			

		} catch (Exception e) {
		}
		
		// 리스트 출력
		for(User1VO user : users) {
			System.out.println(user);
			
		}
		System.out.println("Select 완료...");

	}
}
