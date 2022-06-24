import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        
         
       int numbers[]=new int[4]; //declaration and definition of array

       numbers[0]=20;
       numbers[1]=25;    //assigning the elements to each index one by one
       numbers[2]=30;
       numbers[3]=40;

       System.out.println(numbers[3]);
       System.out.println(numbers[1]);


     System.out.println("2nd method");


    //    2nd method ,,that take elements from the users
      int numbers1[]=new int[8];  //declaration and definition of array
      Scanner input=new Scanner(System.in);


      for(int i=0; i<=7; i++){      //for taking the values from users and 
          numbers1[i]=input.nextInt(); //puting into array indexes

      }
      for (int i=0; i<=7; i++){
        System.out.println("numbers1["+i+"]= "+numbers1[i]); // print each element at indexes
        
      }


      System.out.println("3rd method");


      // third method of array, initialization

      int numbers2[]={10,20,30,40,50,60,70,80,90,100,101}; //array initialization

      System.out.print(+numbers2[4]+" "+numbers2[8]+" "+numbers2[10]); //print the element at the desired index


      System.out.println("\nprint in reverse");


      // to print the elements in reverse order

      int numbers3[]=new int[8];  //declaration and definition of array


      for(int i=0; i<=7; i++){      //for taking the values from users and 
          numbers3[i]=input.nextInt(); //puting into array indexes

      }
      for (int i=7; i>=0; i--){
        System.out.println("numbers3["+i+"]= "+numbers3[i]); // print each element at indexes
        input.close();
      }
    }
}
