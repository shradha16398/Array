package array;

import java.util.Scanner;

public class Normal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two no");
        int a=sc.nextInt();
        int b=sc.nextInt();
       add(a,b);

    }
    static  void add(int c,int d)
    {
        int e=c+d;
        System.out.println(e);

    }
}
