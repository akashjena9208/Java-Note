package ExceptionHandking;

import java.util.Scanner;

/*
 * try finnaly try resorce
 * conction:-user to input collect ot collectd to database  or colleteed to file  that is called connection.
 * resources:-code & file connect or code & database connected that is resources
 * resources creat  so it is closed 
 * 
 */

public class exc_3 
{
    public static void main(String[] args) 
    {
        // normal section
        int num=0;
        //resource created
        Scanner Sc =new Scanner(System.in);

        try
        {
            //critical section
            
            num=Sc.nextInt();
            //resource used

            ////resource closed  repet so used final
            // Sc.close();
        }

        //Exception Hnadling
        catch(Exception e) 
        {
            System.out.println("Enter a Number"+e);

            //resource closed
            // Sc.close();
        }
        //2 time repet the code cloed the code used finally key word and closed the resources
        finally 
        {
            //resource closed
            Sc.close();
        }
        
        System.out.println(num);

    }
}
