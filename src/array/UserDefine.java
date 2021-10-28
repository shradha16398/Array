package array;

import java.util.Scanner;

public class UserDefine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element of an array");
        for(int a=0;a<arr.length;a++)
        {
            arr[a]=sc.nextInt();

        }
        System.out.println("elements of array are");
        for (int a=0;a< arr.length;a++)
        {
            System.out.println(arr[a]);
        }
    }
}
