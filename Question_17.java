import java.util.*;
public class Question_17{
    public static void main(String args[])
    {
        ArrayList<String>a=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            a.add(sc.nextLine());
        }
        Collections.sort(a);
        for(String s:a)
        {
            System.out.println(s);
        }
        String combinedString=a.get(0)+a.get(1);
        System.out.println(combinedString);
        String firstString=a.get(0);
        String reverseString="";
        for(int i=firstString.length()-1;i>=0;i--)
        {
            reverseString+=firstString.charAt(i);

        }
        System.out.println(reverseString);
    }
}