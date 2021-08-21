
package Practical1;
import java.util.Scanner;

public class p1q3 {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Let user prompt their cerdit card number
        System.out.print("Enter you credit card last 8 digit >> ");
        int cardNumber = in.nextInt();
        
        int sum1=0;
        int temp1 = cardNumber;
        int total = 0;
        String standard = "";
        int lastdigit;

        //use to run first time calculation 
        for (int i=1;i<8;i+=2)
        {
            sum1+= temp1%10;
            temp1/= 100;  
        }
        
        //use to run second time calculation 
        int sum2=0;
        int temp2= cardNumber / 10;  
        for (int i=1; i<8; i+=2)
        {
            int digit = (temp2 % 10) *2; // don't forget to double the value- thus the *2 here
            sum2 += digit%10;  //the ones digit
            
            digit /= 10;  //the tens digit 
            sum2 += digit;  
            
            // move left two digits, base, ten, to get to the next relevant digit...
            temp2 /= 100;
        }
        total = sum1+sum2; // total up the sum 1 and sum 2
        
        //java book chapter 4
        standard = Integer.toString(total); //convert the credit card number into string 
        
        //use this to do the last calculation for the cresit card number 
       lastdigit = Integer.parseInt(standard.substring(standard.length()-1, standard.length()));

        
       //to print out the number result
        if (lastdigit == 0)
        {
            System.out.println(cardNumber + " is valid ");
        }
        else 
        {
            System.out.println( cardNumber + " not valid ");
        }
    }
    }