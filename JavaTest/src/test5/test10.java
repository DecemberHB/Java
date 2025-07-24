package test5;

public class test10 {
	public static void main(String[] args) {
	 String path = "C:\\Users\\GGG\\Desktop\\Result.txt";
	 try {
		 File file = new File(path);
		 FileWriter fw = new FileWriter(file);
	 }
	 } 
	
	 for(int x=2 ; x<=9 ; x++) {
	 fw.
	 for(int y=1 ; y<=9 ; y++) {
	 int z = x * y;
	 fw.
	 }
	 }
	 fw.close();
	 catch (IOException e) {
	 e.printStackTrace();
	 }
	 System.out.println("구구단 파일 출력 완료...");
