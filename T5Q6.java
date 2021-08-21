
package Tutorial5;
import java.util.Scanner;
public class T5Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter login id >> ");
        String id = sc.nextLine();
        
        System.out.println(validateID(id));
    }
    
    	public static boolean validateID(String loginID){
	    	
		int count = 0,digit = 0,letter = 0;
	if(loginID.length() >= 6 && loginID.length() <= 10 && Character.isUpperCase(loginID.charAt(0))){
		for(int i=0;i<loginID.length();i++){
		    if(Character.isLowerCase(loginID.charAt(i))){
		    count++;
		    }
		    
		    if(Character.isDigit(loginID.charAt(i))){
		        digit++;
		    }
		    
		   if(Character.isLetter(loginID.charAt(i))){
		       letter++;
		   }
		}
	}
	return loginID.length() >= 6 && loginID.length() <= 10 && Character.isUpperCase(loginID.charAt(0)) && count >= 1 && digit >= 1;
	}

}


