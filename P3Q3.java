
package Practical3;

import java.util.Scanner;

public class P3Q3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       //the array will be use in this program 
       int[] productDenomination = new int[6];
       int[] productQuantity = new int[6];
       int[] productValue = new int[6];
      
       //this use to sum the all price 
       int sumProductPrice = 0;
       
       //use to ask the user information
       for(int i=0;i<6;i++){
           
           //let user enter the denomination 
           System.out.print("Denomination (RM) >> ");
           productDenomination[i] = sc.nextInt();
           
           //let user enter the quantity 
           System.out.print("Quantity >> ");
           productQuantity[i] = sc.nextInt();
           
           //use to calculate the value of the product
           productValue[i] = productQuantity[i] * productDenomination[i];
           
           //use to sum the all product value 
           sumProductPrice += productValue[i];
       }
       
       
       System.out.println("Denomination(RM)  " + "  Quantity " + " Value ");
       
       //use to display the all result
       for(int i=0;i<6;i++){
           if(productQuantity[i]==0){
                int remove = productDenomination[i];
                int remove2 = productQuantity[i];
                int remove3 = productValue[i];
                       }
           else{
                System.out.printf("%3d %21d %8d\n", productDenomination[i], productQuantity[i], productValue[i]);

            }
        }
       
       //use to print out the sum of product 
       System.out.println("Total = RM " + sumProductPrice);
    }
    
}
