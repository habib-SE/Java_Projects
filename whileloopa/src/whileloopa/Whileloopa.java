/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileloopa;

/**
 *
 * @author Engineer
 */
import java.util.Scanner;
public class Whileloopa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner s=new Scanner (System.in);
                int i,rep;
                rep=0;
                do{
                
                System.out.println("from where you want to start? ");
                i=s.nextInt();
        while(i<50){
            
            System.out.println(i );
            i++;
            
        }
        System.out.println("if you want to repeat enter 1 otherwise enter 0");
            rep=s.nextInt();
                }
        while(rep==1);
    }
   
}
