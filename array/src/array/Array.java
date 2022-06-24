/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Scanner;
/**
 *
 * @author Engineer
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[]=new int[4];
        numbers[0]=50;
        numbers[1]=40;
        numbers[2]=30;
        numbers[3]=20;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        
    //////////////////////////////////////
    
        System.out.println("2nd mathed");
        
        
        int number1[]=new int[10];
        Scanner input =new Scanner(System.in);
        for(int i=0; i<=9; i++){
        number1[i]=input.nextInt();   
    }
        for(int i=0; i<=9; i++){
            System.out.println("numbers1["+i+"]:"+number1[i]);
        }
    
}}
