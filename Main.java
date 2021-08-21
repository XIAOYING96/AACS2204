package P4Q6;

public class Main {

    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane("XYZ 0001",250000.0,2005,100);
        
        plane1.setID("AWX 0003");
        plane1.setNumOfPassenger(190);
        
        System.out.println(plane1.toString() + "Current Value >> " + plane1.calCurrentValue());
        System.out.println(plane2.toString() + "Current Value >> " + plane2.calCurrentValue());
    }
    
}
