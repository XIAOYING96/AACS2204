import java.util.Scanner;
       
/**
 *
 * @author ASUS
 */
public class p1q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String name = input.nextLine();
        
        System.out.print("Enter your year to study : ");
        int year = input.nextInt();
        
        System.out.print("What is  your target GPA for this semester ?");
        float gpa = input.nextFloat();
        
        System.out.println();
        
        System.out.println("Welcome " + name );
        System.out.println(" ");
        System.out.println("Work hard to achieve your target GPA of " + gpa + 
                " this semester of your year " + year + ".");
        
    }
    
}
