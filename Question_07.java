import java.lang.*;

class MyCalculator{
    public long power(int n,int p)
    {
        if(n<0 || p<0)
        {
            throw new ArithmeticException("n and p can't be negative");

        }
        else if(n==0 || p==0)
        {
            throw new ArithmeticException("n and p can't be zero");
        }
        else
        {
            return (long) Math.pow(n,p);
        }
    }
}
public class Question_07{
    public static void main(String args[])
    {
        MyCalculator c=new MyCalculator();
        System.out.println(c.power(9,3));
    }
}