package student.com.it;

public class Student2 {
	//instance variable
	String name;
	int age;
	String color;
	String sex;
	
	public void methodStd1(String n,int a,String c,String s) {
		//3.Data input for Student Object1
		name = n;
		age = a;
		color = c;
		sex = s;
	}
	public static void main(String[]args) {
		//1.create object here
		Student2 Std1 = new Student2();
		Student2 Std2 = new Student2();
		Student2 Std3 = new Student2();
		
		//2.Called all data objects1
		Std1.methodStd1("James",20,"Black","male");
		//4.Display all data objects1
		System.out.println("Student object1");
		System.out.println(" name: " + Std1.name + ":\n age: " + Std1.age);
		System.out.println(" color: " + Std1.color + ":\n sex: " + Std1.sex+"\n");

		Std2.methodStd1("Tao",20,"Black","male");

		System.out.println("Student object1");
		System.out.println(" name: " + Std2.name + ":\n age: " + Std2.age);
		System.out.println(" color: " + Std2.color + ":\n sex: " + Std2.sex+"\n");

		std3.methodStd1("Nitas",20,"Black","male");

		System.out.println("Student object1");
		System.out.println(" name: " + Std3.name + ":\n age: " + std3.age);
		System.out.println(" color: " + Std3.color + ":\n sex: " + std3.sex+"\n");
	}
}