package p266;
class Person{
	private int weight;
	int age;
	protected int height;
	public String name;

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}


class Student extends Person{ 
	public void set() {
		age = 30;
		name = "홍길은";
		height = 175;
		setWeight(99);
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.set();
	}
}
