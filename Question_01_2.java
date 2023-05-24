
//Write a Java program to find the common elements between two arrays of integers.
import java.util.Arrays;
import java.util.Scanner;

public class Question_01_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in first array : ");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter the first array elements : ");
        for (int i=0;i<n;i++){
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter number of elements in second array : ");
        int m = sc.nextInt();
        int[] array2 = new int[n];
        for (int i=0;i<m;i++){
            array2[i] = sc.nextInt();
        }
        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+ Arrays.toString(array2));

        System.out.print("Common Elements are : ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if(array1[i] == (array2[j]))
                {

                    System.out.print((array1[i]));
                    System.out.print(" ");

                }
            }
        }

    }
}
