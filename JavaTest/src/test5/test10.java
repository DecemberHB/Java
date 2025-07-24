package test5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test10 {
    public static void main(String[] args) {

        // 저장할 파일 경로
        String path = "C:\\Users\\GGG\\Desktop\\Result.txt";

        try {
            // 파일 객체 생성
            File file = new File(path);

            // 파일에 데이터를 쓰기 위한 FileWriter 객체 생성
            FileWriter fw = new FileWriter(file);

            // 구구단 2단부터 9단까지 반복
            for (int x = 2; x <= 9; x++) {
                fw.write("==== " + x + "단 ====\n"); // 단 제목 작성

                for (int y = 1; y <= 9; y++) {
                    int z = x * y; // 곱셈 결과 계산
                    fw.write(x + " x " + y + " = " + z + "\n"); // 한 줄씩 작성
                }

                fw.write("\n"); // 각 단마다 한 줄 띄우기
            }

            fw.close(); // FileWriter 닫기 (중요)

        } catch (IOException e) {
            // 예외 발생 시 오류 내용 출력
            e.printStackTrace();
        }

        // 완료 메시지
        System.out.println("구구단 파일 출력 완료...");
    }
}
