/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class exercrise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n=0;
        
        while(Math.pow(n+1, 3)<12000){
            n++;
        }
        System.out.println("The highest number is " + n);
    }
    
}
