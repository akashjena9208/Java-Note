package MultiThreading;
/* */

import java.util.Scanner;

public class multi_1 
{
    public static void main(String[] args)
    {
        //task-1
        System.out.println(" Calculation Starded");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The 1st Number");
        int num1=sc.nextInt();
        System.out.println("...............................");
        
        //task2
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();
        int res=num1+num2;
        System.out.println("Adding two number "+res);
        System.out.println("Calculation End");
        System.out.println("...............................");

        // task-3
        for(int i=0;i<3;i++)
        {
            System.out.println("I'm Akash");
        }
        System.out.println("Thread end");
    }
}
