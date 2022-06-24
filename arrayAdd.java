/**
 * arrayAdd
 */
import java.util.Scanner;
public class arrayAdd {

    public static void main(String[] args) {
        
        int numbers[]=new int[10];  //array declaration and initilization
       Scanner input= new Scanner(System.in);
    
       for(int i=0; i<=9; i++)
       {
        
           numbers[i]=input.nextInt();

       }
       int sum=0;
       for(int i=0; i<=9; i++)
       {
            sum=sum+numbers[i];
           

       }
       System.out.println("the sum is = "+sum); //use it outside the loop b/c we want to first add all the elements in loop and then print their sum
       input.close();
    }
}

//remember: do not use nested loop in this program b/c first we want to take the all elements at each index of the arrat and then in the 2nd loop we want to add it 