import java.util.Scanner;

public class p1q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age (years):");
        int ageUser = input.nextInt();
        
        int days = (int)( ageUser * 365);
        int seconds = (int)(days * 24 * 60 * 60);
        
        System.out.print("Age in years : " + ageUser + "\n");

        System.out.print("Age in days : " + days + "\n");
        System.out.print("Age in seconds : " + seconds + "\n");
        
        System.out.print("Process completed");
    }
    
}
