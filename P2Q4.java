
package Practical2;

import java.util.Scanner;
public class P2Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input integer number 
        System.out.print("Enter three integer number >> ");
        int integerNumber1 = sc.nextInt();
        int integerNumber2 = sc.nextInt();
        int integerNumber3 = sc.nextInt();
        
        //convert integer into double 
        double number1 = Double.valueOf(integerNumber1);
        double number2 = Double.valueOf(integerNumber2);
        double number3 = Double.valueOf(integerNumber3);
        
        //connect average 
        double averageNumber1 = calculateAverage3(number1, number2);
        double averageNumber2 = calculateAverage4(number1,number2,number3);
        
        //output result
        System.out.println("The integer average number of two parameter is " + calculateAverage1(integerNumber1,integerNumber2));
        System.out.println("The integer average number of three parameter is " + calculateAverage2(integerNumber1,integerNumber2,integerNumber3));
        System.out.printf("The doubel average number of two parameter is %.2f\n" , averageNumber1);
        System.out.printf("The double average number of three parameter is %.2f\n" , averageNumber2);
    }
    
    //calculate integer average and return it  
    public static int calculateAverage1(int integerNumber1,int integerNumber2){
        return (integerNumber1 + integerNumber2) / 2;
    }
    
    //calculate integer average and return it 
    public static int calculateAverage2(int integerNumber1, int integerNumber2, int integerNumber3){
        return (integerNumber1 + integerNumber2 + integerNumber3) / 3;
    }
    //calculate double average and return it 
    public static double calculateAverage3(double number1, double number2){
        return (double)(number1 + number2) / 2;
    }
    
    //calculate double average and return it 
    public static double calculateAverage4(double number1, double number2,double number3){
        return (double)(number1 + number2 + number3) / 2;
    }


    
}
