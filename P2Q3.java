
package Practical2;

public class P2Q3 {

    public static void main(String[] args) {
        
        System.out.println("Inches     Centimeters     Inches     Centimeters\n");
		for (double in = 1.0, cm = 5.0;in <= 10.0; in++, cm += 5) {
			System.out.printf("%-12.2f", in);
			System.out.printf("%-15.2f", inchToCentimeter(in));
			System.out.printf("   %-15.2f", cm);
			System.out.printf("%-7.2f\n\n", centimeterToInch(cm));
		}
	}

	//calculate inches to cm and return it 
	public static double inchToCentimeter(double in) {
		return in * 2.54;
	}
	//calculate the cm to inches and return it 
	public static double centimeterToInch(double cm){
		return cm / 2.54;
	}
    }

