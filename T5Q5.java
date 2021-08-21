
package Tutorial5;
import java.util.Scanner;
public class T5Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you cresit card number >> ");
        String creditCardNum = sc.nextLine();
                 
        System.out.println(validateCreditCardNumber(creditCardNum));
    }
   
    public static boolean validateCreditCardNumber(String number){
        for(int i= 0; i<= number.length();i++){
            if(!Character.isDigit(number.charAt(i)))
                return false;
        
            if(number.length() != 16)
                return false;
            
        }
                return true;
            }
            
    }
    
}
        
