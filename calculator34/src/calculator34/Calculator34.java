/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator34;

import java.util.Scanner;
public class Calculator34 {

  

class calc{
   static int a,b;
   static Scanner sc=new Scanner(System.in);
   static void input1(){
       System.out.println("enter a");
       a=sc.nextInt();
       System.out.println("enter b");
       b=sc.nextInt();
        }
  static void input2(){
       System.out.println("enter a no of a again");
       a=sc.nextInt();
        }
   static int add(int a,int b){
     return a+b;
   }
   static int sub(int a,int b){
        return a-b;
    }
    static int mul (int a,int b){
        return a*b;
    }
   static int dive(int a,int b){
        return a/b;
        
    }
    static int sqr(int a,int b){
        
        return a*a;
    } 
   static double sqroot(int a,int b){
        return Math.sqrt(a);
    }
        class calculator extends calc{
            
          static double c;
        static  void input3(){
              System.out.println("enter c");
              c=sc.nextInt();
          }
        static  double sine(double d){
            return Math.sin(d);  
              
          }
         static double cosine(double d){
              return Math.cos(d);
          }
         static double tan(double d){
                 return Math.tan(d);
                  }
        }
        
    }

/**
 *
 * @author HABIB UR REHMAN
 */

   
    
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               int choice;
            
        Scanner sc=new Scanner (System.in);
               System.out.println("----MENU-----");
               System.out.println("ARTHIMATIC OPRATION");
            System.out.println("1,add \n2.sub \n3.mul \n4.dev \n5.sqr \n6. sqroot");
            System.out.println("enter ");
            
            
            System.out.println("enter choice");
            choice=sc.nextInt();
            switch( choice){
                case 1:
                    
                            
                            
                            
                            
                            
                            
                            
                            
                    
                case 2:
                    sub();
         
                            
            }
            
        // TODO code application logic here
    }
}
   
