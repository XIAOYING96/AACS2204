/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class calculateStandardDeviation {

  
    public static void main(String[] args) {
        final int COUNT = 20; // student number 
                
        int number =0;//this use to store random number 
        double sum = 0;// this use to calculate sum number 
        double squareSum = 0;//this use to store the sm of the square number 
        
        //use to find random number 
        for(int i=0;i<COUNT;i++){
            number = Math.round((float)Math.random()*100);
            
            //use to sum the random number 
            sum += number;
            
            //calculate square sum
            squareSum += Math.pow(number, 2);
        }
        
        //find the mean number
        double mean = sum / COUNT;
        
        //use to calculate standard deviaiton
        double standardDeviation = Math.sqrt((squareSum - sum * sum / COUNT) / (COUNT - 1));
        
        //display result
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + standardDeviation);
    }
    
}
