import java.util.*;
interface Account{
    abstract void set(String name,double acc_no,int balance);
    abstract void display();

}
interface Person1{
    abstract void store();
    abstract void disp();
}
class Customer implements Account,Person1{
    String name;
    double acc_no;
    int balance;
    @Override
    public void set(String name, double acc_no, int balance) {
        this.balance=balance;
        this.acc_no=acc_no;
        this.name=name;
    }
    @Override
    public void display()
    {
        System.out.println("Name: "+name+" Account No.: "+acc_no+" Balance:"+balance);
    }
    public void store()
    {
        System.out.println("Storing a information of employee");
    }
    public void disp()
    {
        System.out.println("Displaying Information of Empolyee");
    }
}
public class Question_19 {
    public static void main(String[] args) {
        Customer C=new Customer();
        C.set("A",123456568,5000);
        C.display();
        C.disp();
        C.store();
    }
}