package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.WriteAbortedException;

/*
 * 날짜 : 2025/07/23
 * 이름 : 박효빈
 * 내용 : 자바 파일 입출력 스트림 실습하기
 * 중요 예제 *
 * */
public class StreamTest {

	public static void main(String[] args) {
		String source = "C:\\Users\\GGG\\Desktop\\sample1.txt";
		String target = "C:\\Users\\GGG\\Desktop\\sample2.txt";

		try {

			// 바이트 스트림 생성 (파일 연결)
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 문자 스트림 한글은 아스키코드가 존재하지않음
			FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(target);
			
			
			
			// 무한 반복으로 스트림 작업 수행 -> 파일을 다 읽어올떄까지 작업을 해야함으로
			while(true) {
				
				//파일 읽기 여러 선택지 중에 catch 추가를 선택함
				int data = fis.read();
				
				// 문자 읽기
				int text = fr.read();
				
				if(data == -1 || text == -1) {
					break; // 파일내용이 없으면 종료(.read()의 return 값)
				}
				
				char ch = (char)data; // 변환을 통해 data -> 아스키코드의 데이터를 char로 변환 한글은 깨짐
				//바이트 스트림
				//System.out.println(ch);
				
				// 문자 스트림 출력
				char ch2 = (char) text;
				System.out.println(ch2);
				
				
				// 파일 쓰기
				//fos.write(data); // 바탕화면에 sample2 생성
				
				fw.write(text); 
				
			}
			// 스트림 작업 종료 종료 안할 시 메모리 낭비
			fis.close();
			fos.close(); 
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO int data = fis.read(); 에 대한 catch문
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
