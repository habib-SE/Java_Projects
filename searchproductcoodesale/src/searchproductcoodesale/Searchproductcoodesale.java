/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchproductcoodesale;
import java.util.Scanner;
/**
 *
 * @author Engineer 
 */
public class Searchproductcoodesale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int product[]=new int[4];
        Scanner s=new Scanner (System.in);
        int productcode[]={150,200,300,400};
        int salepercent[]={25,50,75,70};
        int searchcode;
        System.out.println("enter the search code");
        searchcode=s.nextInt();
        for(int i=0; i<4; i++){
            System.out.println("the sale on"+productcode[i]+"is"+salepercent[i]+"%");
            
        }
        if(productcode==salepercent){
            System.out.println("the product sale is"+salepercent);
        }
        // TODO code application logic here
    } 
    
}
