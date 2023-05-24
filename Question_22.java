class Person2{
    String FirstName;
    String LastName;

    public Person2(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }
    public void getFirstName()
    {
        System.out.println(FirstName);
    }
    public void getLastName() {
        System.out.println(LastName);
    }
}
class Employee1 extends Person2{
    int employeeId;
    String title;

    public Employee1(String firstName, String lastName, int employeeId,String title) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.title=title;
    }
    public void getEmployeeId()
    {
        System.out.println("Employee ID: "+employeeId);
    }
    public void getLastName() {
        System.out.println(title);
    }

}
public class Question_22 {
    public static void main(String[] args) {
        Employee1 e=new Employee1("Anish","Lakhkar",61,"PL Lover");
        e.getEmployeeId();
        e.getLastName();
        e.getFirstName();

    }
}