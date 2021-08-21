
public class MaxNumber {

    public static void main(String[] args) {
        //intializ the array number 
       int[] number = {1,2,3,4,5};
       
       //use the number in place 0 to find the largest number 
       int largestNumber = number[0];
       
       // use foreach loop to loop the number 
       for(int largestElement : number){
           
           //if the largest element is largest than largest number , the system will 
           //take the number 
            if(largestElement > largestNumber) largestNumber = largestElement;
            
       }
       //print out the largest number 
      System.out.println("The largest number is " + largestNumber);
        
    }
    
}
