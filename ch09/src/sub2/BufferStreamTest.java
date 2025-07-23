package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2025/07/23
 * 이름 : 박효빈
 * 내용 : 자바 버퍼  스트림 실습하기
 * 중요 예제 *
 * */
public class BufferStreamTest {

	public static void main(String[] args) {
		String source = "C:\\Users\\GGG\\Desktop\\Person.tif";
		String target = "C:\\Users\\GGG\\Desktop\\Person2.tif";

		try {

			// 기본  스트림 생성 (파일 연결)
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			
			// 보조 스트림(Buffer) 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		
			// 무한 반복으로 스트림 작업 수행 -> 파일을 다 읽어올떄까지 작업을 해야함으로
			while(true) {
				
				//파일 읽기 여러 선택지 중에 catch 추가를 선택함
				int data = bis.read(); // 보조스트림
				
				
				if(data == -1) {
					break; // 파일내용이 없으면 종료(.read()의 return 값)
				}
				
				char ch = (char)data; // 변환을 통해 data -> 아스키코드의 데이터를 char로 변환 한글은 깨짐
				//바이트 스트림
				//System.out.println(ch);
				
				// 파일 쓰기
				bos.write(data); // 바탕화면에 sample2 생성
		
				
			}
			// 스트림 작업 종료 종료 안할 시 메모리 낭비
			
			
			bis.close();
			bos.close(); 
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}
