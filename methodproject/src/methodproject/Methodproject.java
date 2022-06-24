/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodproject;
import java.util.Scanner;
/**
 *
 * @author hab67
 */
public class Methodproject {
    String name;
    String fname;
     int age;
    Methodproject(){
        System.out.println("enter name");
        
         }
    void show(){
        System.out.println("student name"+name);
        System.out.println("enter fther name "+fname);
        System.out.println("enter age"+age);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Methodproject sr=new Methodproject();
        
        sr.show();
        // TODO code application logic here
    }
    
}
