package sub4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * 날짜 : 2025/07/23
 * 이름 : 박효빈
 * 내용 : 파일 처리  실습
 * 
 * */
public class FileTest {

	public static void main(String[] args) {

		String path1 = "C:\\Users\\GGG\\Desktop\\source.txt";
		String path2 = "C:\\Users\\GGG\\Desktop\\sample";

		// 파일 객체 생성
		File file1 = new File(path1);
		File file2 = new File(path2);

		// 파일 작업
		try {
			file1.createNewFile();
			file2.mkdir();

			System.out.println("file1 존재 여부 : " + file1.exists());
			System.out.println("file2존재 여부 : " + file2.exists());
			System.out.println("file1 파일 여부 : " + file2.isFile());
			System.out.println("file2 디렉터리 여부 : " + file2.isDirectory());
			System.out.println("file1 이름  : " + file1.getName());
			System.out.println("file1 이름: " + file2.getName());
			System.out.println("file1 경로 : " + file2.getPath());
			System.out.println("file1 겨오: " + file1.getPath());
			System.out.println("file1 이름: " + file2.isDirectory());
			System.out.println("file2 이름: " + file2.getAbsolutePath());
			System.out.println("file2 이름: " + file2.isDirectory());
			
			
			// 파일 식제
			//file1.delete();
			//file2.delete();
			
			
			// Files 실습
			
		
		Path souerce = Paths.get("C:\\\\Users\\\\GGG\\\\Desktop\\\\source.txt");
		Path target = Paths.get("C:\\\\Users\\\\GGG\\\\Desktop\\\\target.txt");
		Path dest = Paths.get("C:\\\\Users\\\\GGG\\\\Desktop\\\\dest.txt");
		// 파일 복사
		Files.copy(souerce, target);
		
		// 파일 이동
		//Files.move(source, target, null);
		
		//파일 삭제
		
		Files.delete(target);

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		// 파일 읻ㅇ
		//Files.move(ssssssoutk, null, null)

		System.out.println("프로글래몽료");

	}

}
