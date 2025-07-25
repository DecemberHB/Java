package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * 날짜 : 2025/07/25 
 * 이름 : 박효빈 
 * 내용 : 자바 JDBC 실습하기
 *  ** 중요 파트 ***
 *  ** SQL 켜야함
 *  ** 이번 실습은 오라클DB 자신의 ID로 활용
 *  테이블은 USER 1, 2, 3, 4 로 실습
 *  드라이버가 필요함 오라클 드라이버 C:\app\GGG\product\21c\dbhomeXE\jdbc\lib -> ojdbc8.jar
 *  ide 에 폴더 lib 생성후 해당 파일 복붙
 *  프로젝트 우클릭 - build path > confing ... ~ > classpath -> add jars > 경로로 가서 내 jar 등록 apply
 */
public class JdbcTest {
	
	public static void main(String[] args) {
		
		// DB 정보 
		String host = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소 체계 반드시 지킬것
		String user = "hyokong";
		String pass = "1234";
		
		// 데이터베이스 접속
		try {//에러 가능성 많아서 예외처리해야함
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			if (conn !=null ) {
				System.out.println("접속 성공 !");
			}else {
				System.out.println("접속 실패 !");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
