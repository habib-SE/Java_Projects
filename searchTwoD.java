/**
 * searchTwoD
 */
import java.util.*;
public class searchTwoD {

    public static void main(String[] args) {
        int x=0;
        int flag=0;
        int value=0;
        int j=0;
        int i=0;
     int nums[][]=new int[3][3];
        Scanner s=new Scanner(System.in);
     
        System.out.println("enter all the elements of matrix: ");
        for(i=0; i<3; i++){
        for(j=0; j<3; j++){
           
            nums[i][j]=s.nextInt();

        }
        }
      //now for the whole output we have to use two nested loop
      for ( i=0; i<=2; i++){
             
        for(j=0; j<=2; j++){

            System.out.print(nums[i][j]+",");

      
        }
        System.out.print("\n"); //after printing a row print a line

        }


        System.out.println("enter the element you want to search: ");
        x=s.nextInt();

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(nums[i][j]==x){
                    flag=1;
                    break;   //if thee flag value is 1 it will pass it's value to "if "in the outer loop
                }
                else{
                    flag=0;
                }
            }    //end of inner loop
             if (flag==1){
                 value=1;  //if value=1 it will pass the value of "if"from nested loop to the outside of outer loop and hence variable "value" will act as a carrier
                 break;
             }
             else{
                 value=0;
             }
        }  //end of outer loop
        if(value==1){
            System.out.println("the element found at index loc: "+i+","+j);

        }
        else{
            System.out.println("the element not found: ");
        }
        s.close();
    }
}