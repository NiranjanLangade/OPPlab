//Write a Java program to check that String is palindrome or not
import java.util.*;

class Question_03_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.nextLine();

        StringBuilder input1 = new StringBuilder();

        input1.append(input);

        if(input1==input1.reverse()){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("The given string is not palindrome");
        }

        System.out.println(input1);
    }
}