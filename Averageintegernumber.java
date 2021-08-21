
public class Averageintegernumber {

    public static void main(String[] args) {
       
        int sumNumber = 0,avarageNumber = 0;
        
        //intialize the array number 
       int[] number = {1,2,3,4,5};
       
       //use foreach loop to loop the number 
       for(int numberUse : number){
           
           //then, sum the all number 
            sumNumber += numberUse;
            
       }
       
       // use the sum number to divide the number length
       avarageNumber = sumNumber / number.length;
       
       //print out the avarage number 
        System.out.println(avarageNumber);
        
    }
    
}
