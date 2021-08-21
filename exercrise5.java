/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class exercrise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int count = 1; 
        int number = 100;
        while (number < 1000) {
            if (number % 6 == 0 && number % 5 == 0) {
                System.out.print(number + " ");
                number++;
                count++;
            }

            if (count % 11 == 0 && count != 0) {
                System.out.println();
                count++;
            }
            else {
                number++;
            }
        }
    }
    
}
