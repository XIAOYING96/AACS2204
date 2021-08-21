/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class exercrise4 {

    public static void main(String[] args) {
         int count=0;
		 for(int number = 13; number <= 44; number++) {
		     count++;
        if(count % 7 == 0 && count > 0)
            System.out.println(number);
        else
            System.out.print(number + " ");
    }
 }
}
         
        
    
