/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchloop;
import java.util.Scanner;
/**
 *
 * @author Engineer
 */
public class Switchloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1, num2,result,choice,rep=0;
        do{
        System.out.println("enter num1");
        num1=s.nextInt();
        System.out.println("enter num2");
        num2=s.nextInt();
        System.out.println("choice: add 1 :sub 2: mul 3 :modu 4");
        System.out.println("entern choice");
        choice=s.nextInt();
        switch(choice){
            case 1:
                result=num1+num2;
                System.out.println("Addition="+result);
                break;
            case 2:
                result=num1-num2;
                System.out.println("subtraction="+result);
                break;
            case 3:
                result=num1*num2;
                System.out.println("multiflication="+result);
                break;
            case 4:
                result=num1%num2;
                System.out.println("modulious="+result);
                break;
            default :
                        System.out.println("invalid choice");
                
        }
         
        System.out.println("do you want to repeat program to enter 1:");
            rep=s.nextInt();
        
               
        
        // TODO code application logic here
    }while(rep==1);
    
}}
