/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenloop;
import java.util.Scanner;
/**
 *
 * @author Engineer
 */
public class Evenloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int raja =0;
        for(int i=0; i<100; i++)
        {
            if(i%2==0)
            {
                System.out.println("even number is ="+i);
            }
       else
            {
                raja=0;
            }
        }
        for(int i=0; i<5; i++)
        {
            int a,b,c;
            a=5;b=5;
            c=a+b;
            System.out.println("the value  of c is="+c);
                    
        }
        for(int i=0;i<5;i++ )
        {
            int num1,num2,R;
            System.out.println("enter num1");
            num1=s.nextInt();
            System.out.println("enter num2");
            num2=s.nextInt();
            R=num1+num2;
            System.out.println("the value of R is="+R);
        }
        
    }
    
}
