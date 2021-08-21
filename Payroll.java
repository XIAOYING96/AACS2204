
public class Payroll {

   
    public static void main(String[] args) {
        
        //compute net pay 1
        System.out.println("computeNetPay = RM " + String.format("%.2f",
                computeNetPay(42,6.50,0.15)));
        
        //compute net pay 2
        System.out.println("computeNetPay = RM " + String.format("%.2f",
                computeNetPay(42,6.50)));
        
        //the compute net pay 3
        System.out.println("computeNetPay = RM " + String.format("%.2f",
                computeNetPay(42)));
    
    }
    
    // way calculate net pay 1
    public static double computeNetPay(int hoursWorked,double payRate,double taxRate){
        return hoursWorked*payRate*(1-taxRate);
    }
    
    //way calculate net pay 2
    public static double computeNetPay(int hoursWorked,double payRate){
        return hoursWorked*payRate*(1-0.15);
    }
    
    //way calcualte net pay 3
    public static double computeNetPay(int hoursWorked){
        return hoursWorked*8.5*(1-0.15);
    }
}
