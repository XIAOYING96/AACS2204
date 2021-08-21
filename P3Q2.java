
package Practical3;

public class P3Q2 {

    public static void main(String[] args) {
        
        //intialize the array number 
        int[] list = {1,2,4,5,10,100,2,-22};
        
        //use the index 0 in the list to find the biggest number
        int smallestNumber = list[0];
        int index = 0; 
        
        //use the for loop to loop the number to find the smallest number 
        for(int i = 0;i < list.length ; i++){
            
            // if the number is smallest than the list 
            if(list[i] < smallestNumber){
                
                //the smallest number will pass to the smallest number 
                smallestNumber = list[i];
                
                //find the smallest number index 
                index = i;
                
                //print out the smallest number index
                System.out.println(i);
            }
               
            }
        }

    }
