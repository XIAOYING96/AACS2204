
package P4Q4;

public class Owner {
    private static String ownerName;
    private int ownerIc;
    
    public Owner(String ownerName, int ownerIc){
        this.ownerName = ownerName;
        this.ownerIc = ownerIc;
    }
    
    public static String getOwnerName(){
        return ownerName;
    }
    
    public int getOwnerIc(){
        return ownerIc;
    }
    
    public String toString(){
        return String.format(ownerName, ownerIc);
    }
}
