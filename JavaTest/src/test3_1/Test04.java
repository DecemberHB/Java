package test3_1;


class Student{
	public static int studentId;
	private String studentName;
	private String mojor;
	private int grade;
	
	public Student(String studentName, String mojor, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.mojor = mojor;
		this.grade = grade;
	}
	public void studentInfo() {
		System.out.println("-----------------------");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("학번 : "+mojor);
		System.out.println("학번 : "+grade);
	}
}
public class Test04 { // studentId이 접근해야하므로 해당 변수는 public 선언
	
	public static void main(String[] args) {
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentInfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studentInfo();
	}

}
