package student.com.it;

public class Student{
    String name;
    int age;
    String color;
    String sex;

    public static void main(String[]args)
    {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        std1.name = "james";
        std1.age = 20;
        std1.color = "Black";
        std1.sex= "Mele";

        std2.name = "Tao";
        std2.age = 20;
        std2.color = "Black";
        std2.sex= "Mele";

        std3.name = "Nitas";
        std3.age = 20;
        std3.color = "Black";
        std3.sex= "Mele";

        system.out.println("Student object 1");
        system.ouy.println("name: " std1.name + ":\n age: " + std1.age);
        system.ouy.println("color: " std1.color + ":\n sex: " + std1.sex);

        system.out.println("Student object 2");
        system.ouy.println("name: " std2.name + ":\n age: " + std2.age);
        system.ouy.println("color: " std2.color + ":\n sex: " + std2.sex);
        
        system.out.println("Student object 3");
        system.ouy.println("name: " std3.name + ":\n age: " + std3.age);
        system.ouy.println("color: " std3.color + ":\n sex: " + std3.sex);

    }
}