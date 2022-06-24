import java.util.Scanner;
public class twoDArray {
    public static void main(String[] args) {

        System.out.println("first method");

        int numbers[][]=new int[3][3];
        numbers[0][0]=2;
        numbers[0][1]=3;
        numbers[0][2]=1;
        numbers[1][0]=4;
        numbers[1][1]=3;
        numbers[1][2]=8;
        numbers[2][0]=2;
        numbers[2][1]=9;
        numbers[2][2]=5;
  
        for(int i=0; i<=2; i++) {

           for(int j=0; j<=2; j++){

            System.out.print(numbers[i][j]);
           }
           System.out.print("\n");
        }

       System.out.println("2nd method");
       //by taking inputs from the users

       int numbers1 [][]=new int[3][3];

       Scanner input=new Scanner (System.in);
       
       //for input of 3 by 3 matrix we have to use two loops (nested)
         for (int i=0; i<=2; i++){
           
            for( int j=0; j<=2; j++){

        numbers1[i][j]=input.nextInt();

      
            }
        
         }

         //now for the whole output we have to use two nested loop
         for (int i=0; i<=2; i++){
             
            for(int j=0; j<=2; j++){

                System.out.print(numbers1[i][j]+",");

          input.close();
            }
            System.out.print("\n"); //after printing a row print a line

            }
            
        System.out.println("3rd method ");

        int numbers2[][]={ 
            {1,2,3},
            {8,6,4},             //initialization
            {9,6,7}
         };


        for(int i=0; i<=2; i++)
        {   
            for(int j=0; j<=2; j++){
             
          System.out.print(numbers2[i][j]+",");

            }
            System.out.println();

        }

       
    }
}
