
package Practical2;

public class P2Q1 {

    public static void main(String[] args) {
        float squareRoot = 0;
        int i = 0;

        
        System.out.print("Number   SquareRoot\n");
        
        //use for loop to calculate the square root
        for(i = 0;i <= 20;i+=2){
            
            //use math sqrt to calculate the result
            squareRoot =(float) Math.sqrt(i);
            
        //print out result
        System.out.printf("  %d \t   %.4f",i,squareRoot);
        System.out.println();
        
        }
        
        
    }
    
}
