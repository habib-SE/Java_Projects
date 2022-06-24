import java.util.Scanner;
public class searchInArray {
    public static void main(String[] args) {

        int i=0;
        int value=0;

        int numbers[]=new int[10];  //array declaration and initilization
        Scanner input = new Scanner(System.in);
     
        System.out.println("enter the elements: ");
        for( i=0; i<=9; i++)
        {
         
            numbers[i]=input.nextInt();
 
        }
        int searchnum;

        System.out.println("Enter the element you want to search : ");
         searchnum=input.nextInt();
        
        for( i=0; i<=9; i++)
        {
            
            //this loop will start searching from index 0 to 9 if the element at index =searchnum then it will print the index i of that element else it will print not found
        
         if
        ( searchnum==numbers[i]){
             value=1;
          
             break;
             
        }else{
            
            value=0;
        }
        

        }

        if(value==1)
        {
            System.out.println("the element found at index loc : "+i);
        }
        else{

            System.out.println("element not found");
        }
       
        input.close();

    }
}
