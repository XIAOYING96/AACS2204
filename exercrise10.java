/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class exercrise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 0.0;
        
        double n,num;
        
        for(n=1.0;n<=97.0;n+=2){
            num = n / (n+2);
            sum+=num;
        }
        System.out.print(sum);
    }
    
}
