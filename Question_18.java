import java.util.*;
class Person{
    public int age;
    public String name;
    public Person(int age,String name)
    {
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person{
    int salary;
    String Designation;
    public Employee(int salary,int age,String name,String Designation)
    {
        super(age,name);
        this.salary=salary;
        this.Designation=Designation;
    }
    public String returnName()
    {
        if(this.salary>5000)
        {
            return this.name;
        }
        return "";
    }


}

public class Question_18 {
    public static void main(String args[])
    {
        Employee A=new Employee(2000,20,"A","HR");
        Employee B=new Employee(4000,20,"B","HR");
        Employee C=new Employee(7000,20,"C","HR");
        Employee D=new Employee(8000,20,"D","HR");
        Employee E=new Employee(5000,20,"E","HR");
        ArrayList<Employee>a=new ArrayList<Employee>();
        a.add(A);
        a.add(B);
        a.add(C);
        a.add(D);
        a.add(E);
        for(Employee i:a)
        {
            if(i.salary>5000)
            {
                System.out.println(i.name);
            }
        }

    }
}