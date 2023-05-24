import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Student{
    String name;
    int grade;
    ArrayList<String>Course=new ArrayList<String>();

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public void addCourse(String course)
    {
        Course.add(course);
    }
    public void removeCourse(String course)
    {
        Course.remove(course);
    }
    public void show()
    {
        System.out.println("Name: "+name+" Grade: "+grade);
        for(String c:Course)
        {
            System.out.println(c);
        }
    }
}
public class Question_21 {
    public static void main(String[] args) {
        Student Niranjan=new Student("Niranjan",99);
        Niranjan.addCourse("OOP");
        Niranjan.show();

    }

}