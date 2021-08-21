/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class exercrise3 {

    public static void main(String[] args) {
        final double inches = 2.54;
        
        float cm = 0;
        int i=0;
        
        System.out.print("Inches Centrimetres\n");
        for(i=1;i<10;i++){
            cm = (float) (i * inches);
            
            System.out.printf("   %d "+ "   %.2f\n", i,cm);
             
    }
    }
}
