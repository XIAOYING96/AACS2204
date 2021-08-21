package Tutorial5;
import java.util.Scanner;
public class T5Q4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter you username >> ");
       String userName = sc.nextLine();
       
       System.out.println(validUserName(userName));
    }
    
    public static boolean validUserName(String name){
        if(name.indexOf(' ') == -1 && name.length() >= 6){
            return true;
    }
        else 
            return false;
    }
}
