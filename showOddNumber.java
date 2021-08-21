
import java.util.Scanner;

public class showOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minimun number and max number > ");
        int minNum =input.nextInt();
        int maxNum =input.nextInt();
        
        int sum = 0;
        
       for(int i = minNum;i<=maxNum;i++){
            if(i % 2 != 0){
                System.out.print(i);
                sum+= i;
            }
            //System.out.print(i);
            System.out.println(" ");
        }
       System.out.print(sum);
    }

}
