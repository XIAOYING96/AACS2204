/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4Q4;

/**
 *
 * @author ASUS
 */
public class CarType {
    private String carMake;
    private String carModel;
    private double carCapacity;
    
    public CarType(String carMake,String carModel,double carCapacity){
        this.carMake = carMake;
        this.carModel = carModel;
        this.carCapacity = carCapacity;
    }
    
    public String getCarMake(){
        return carMake;
    }
    
    public String getCarModel(){
        return carModel;
    }
    
    public double getCarCapacity(){
        return carCapacity;
    }
    
    public String toString(){
        return String.format("%10s %10s %15s",carMake, carModel,carCapacity);
    }
}
