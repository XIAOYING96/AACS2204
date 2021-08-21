import java.util.Scanner;
public class CalculateLeapYear {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       boolean leapYear=false;
       
       //prompt user enter any year to calculate leap year
       System.out.print("Enter any year >> ");
       int year=input.nextInt();
       
        if(isLeapYear(year)){
            System.out.print( year + " is a leap year");
        }
        else{
            System.out.print(year + " not is a leap year");
        }
    }
    
    
    public static boolean isLeapYear(int yearNum){
        final int GREGORIANCALENDAR = 1582;
        boolean beforeGREGORIAN = yearNum < GREGORIANCALENDAR;
        
        return  yearNum % 4 == 0 &&(beforeGREGORIAN || !(yearNum % 100 
                == 0) || yearNum % 400 == 0);
    }
    
}
