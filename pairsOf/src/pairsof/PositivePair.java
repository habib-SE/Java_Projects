
package pairsof;


public class PositivePair {
    
    public  PositivePair(){
    
       int M=24;
        for (int i=1; i<13; i++)
        {
           
            System.out.println(i+","+M);
            M=M-1;
        }
        System.out.println("______________________");
        Addition a=new Addition();
       int result= a.add(23, 25);
        System.out.println("the sum of a and b ="+result);
    
    }
    
    
    
    
}
