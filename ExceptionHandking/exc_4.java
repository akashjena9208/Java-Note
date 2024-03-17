package ExceptionHandking;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Try With Resorces Without final key eord used :- write try parameter then run , not add the finally key word
 */


public class exc_4
{
  public static void main(String[] args) 
  {
    int num=0;
    try(Scanner sc = new Scanner(System.in))       /*resorce creat & closed with out wrint finally keyword */    
    {
        System.out.println("Enter a input");   
        num=sc.nextInt();  
    }
    catch(InputMismatchException e)
    {
        System.out.println("somthing went to wrong"+e);
    }

    System.out.println("Your input "+num);
  }  
}
