/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package choice;
import java.util.Scanner;
/**
 *
 * @author Engineer
 */
public class Choice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        int num1,num2,choice,result;
        int rep;
        do{
        System.out.println("enter num1");
num1=myobj.nextInt();
        System.out.println("enter num2");
num2=myobj.nextInt();
        System.out.println("ener choice");
        choice=myobj.nextInt();
        switch(choice){
            case 1:
                   result=num1+num2;
                   System.out.println("the sum is"+result);
                   break;
            case 2:
                result=num1-num2;
                System.out.println("the diff is"+result);
                break;
            default:
                        System.out.println("invalid choice");}
        rep=myobj.nextInt();
    }
        
        
        while(rep==1);

    }
    
}
