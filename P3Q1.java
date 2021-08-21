package Practical3;

import java.util.Scanner;
  
public class P3Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // prompt user to enter the number of quiz
        System.out.print("Enter number of quiz scores to process: ");
        int n = sc.nextInt();
        
        //the user enter number is the array number 
        double[] numbersOfQuiz = new double[n];
        double sumOfScore = 0;

        //use to give user enter their quiz score
        for (int i = 0; i < n; i++) {
            System.out.print("Score " + i + " : ");
            numbersOfQuiz[i] = sc.nextDouble();
            
            //this use to sum the student quiz score
            sumOfScore += numbersOfQuiz[i];
        }

        //use to calculate the avarage of qioz score 
        double averageOfScore = sumOfScore / n;

        //this use to calculate the user above average of the score
        int countAboveAverage = 0; 
        for (int i = 0; i < n; i++) {
            //if the average score is biggest than the quiz number 
            if (averageOfScore < numbersOfQuiz[i]) {
                countAboveAverage++;
            }
        }
            
        //this use to calculate the user below average of the score 
            int countBelowAverage = 0;
            for(int w = 0; w < n;w++){
                //if the averge score is smallest than teh number of quiz
                if(averageOfScore > numbersOfQuiz[w]){
                    countBelowAverage++;
                }
            }
       
            //display result
        System.out.print("Results\n" + "====\n");
        System.out.println("Average is " + averageOfScore);
        System.out.println("Number of elements above the average is " + countAboveAverage);
        System.out.println("Number of score below the avarage is " + countBelowAverage);
    
}
    }
