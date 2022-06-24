/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decisions;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
/**
 *
 * @author Engineer
 */
public class Decisions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System .in);
       int marks;
       
        System.out.println("enter marks");
        marks= s.nextInt();
        if(marks>=90&&marks<=100)
            System.out.println("your gpa is 4.0");
        else if(marks>=80 && marks<=89)
            System.out.println("your gpa is 3.5");
        else if(marks>=70 && marks<=79)
            System.out.println("your gpa is 3.o");
        else if(marks>=60 && marks<=69)
            System.out.println("your gpa is 2.5");
        else if(marks>=50 && marks<=59)
            System.out.println("your gpa is 2.0");
        else if(marks>=40 && marks<=49){
        System.out.println("you are fai");}
      else {
          System.out.println("best of luck next time");
      }
      
    }
    
}
