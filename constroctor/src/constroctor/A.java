/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constroctor;


/**
 *
 * @author HABIB UR REHMAN
 */
public class A {
   
    int a ,b;
    public void add()
    {
         a=20;
         b=40;
        System.out.println(a+b);
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A j=new A();
        A R=new A();
        j.add();
        R.display();
        
        
        
        // TODO code application logic here
    }
    void display(){
        System.out.println("Amjad khatak");
    }
    
}
