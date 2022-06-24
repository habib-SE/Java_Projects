/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysearch;

import java.util.Scanner;

/**
 *
 * @author Engineer
 */
public class Arraysearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mylist[]=new int[4];
        int min,max;
        min=900;
        max=6;
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter values");
        for(int i=0; i<mylist.length;i++){
            mylist[i]=input.nextInt();
  
        }
        
        
        for(int i=0;i<4;i++){
            if(mylist[i]<min){
                min=mylist[i];
            }
     
            
        }
        for(int i=0;i<4;i++){
            if(mylist[i]>max){
               max= mylist[i];
            }
        }
        System.out.println("the smalest  ="  +min+  "\t and largest is="  +max); // TODO code application logic here
    }
    
}
