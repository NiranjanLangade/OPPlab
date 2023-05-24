//Program to remove all repeated elements from an array

import java.util.*;

class Question_01 {

    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        System.out.print(set);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        removeDuplicates(a);
    }
}