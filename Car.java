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
public class Car {
    private String carPlateNum;
    private String carColor;
    private int carYear;
    private CarType carType;
    
    public Car(String carPlateNum, String carColor, int year, CarType carType){
        this. carPlateNum= carPlateNum;
        this.carColor = carColor;
        this.carYear = carYear;
        this.carType = carType;
    }
    
    public String getCarPlateNum(){
        return carPlateNum;
    }
    
    public String getCarColor(){
        return carColor;
    }
    
    public int getCarYear(){
        return carYear;
    }
    
    public String toString(){
        return String.format(carPlateNum,carColor,carYear,carType.toString());
    }
}
