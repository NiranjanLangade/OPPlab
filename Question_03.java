//Java Program to Reverse a String
import java.util.*;

class Question_03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.nextLine();

        StringBuilder input1 = new StringBuilder();

        input1.append(input);

        input1.reverse();

        System.out.println(input1);
    }
}
