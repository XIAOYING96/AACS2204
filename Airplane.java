
package P4Q6;

public class Airplane {
    private String id;
    private double price;
    private int yearOfPurchased;
    private int numOfPassenger;
    private static int numOfAirplane = 0;
    
    public Airplane(String id,double price,int yearOfPurchased,int numOfPurchased){
        this.price = price;
        this.yearOfPurchased = yearOfPurchased;
        this.numOfAirplane = numOfAirplane;
        
    }
    
    public static int getNumOfAirplane(){
        return numOfAirplane * 1;
    }

    public void setID(String id){
       this.id = id;
    }
    
    public String getid(){
        return id;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public int getnumOfPassenger() {
        return numOfPassenger;
    }

    public double calCurrentValue(){
        double currentValue;
        
        currentValue = price - (price * 0.1 * (2011 - yearOfPurchased));
        
        if(currentValue < 0){
            currentValue = 0;
        }
        return currentValue;
    }
    
    public int getYearOfPurchased(){
        return yearOfPurchased;
    }
    
    public String toString(){
        return "ID >> " + id + "\nPrice >> " + price + "\nYear Of Purchased >> "
                + yearOfPurchased + "\nNumber Of Purchased >> " + numOfPassenger;
    }
}
