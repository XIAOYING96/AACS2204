
package P4Q4;

public class Register {
    private static int registerNo = 1001;
    private int regNo;
    private Owner owner;
    private Car car;
    
   public Register(Owner owner, Car car){
       this.regNo = registerNo;
       registerNo++;
       this.owner = owner;
       this.car = car;
   }
   
   
   public static int getRegisterNo(){
       return registerNo;
   }

    public String toString(){
        return(registerNo)+String.format(owner.toString(),car.toString());
    }

}
