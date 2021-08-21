/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicall4Q1;

/**
 *
 * @author ASUS
 */
public class Employee {
    private String name;
     private Double salary;
     
     public Employee(String employeeName, double currentlySalary){
         name = employeeName;
         salary = currentlySalary;
     }
      
    void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
    }
    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
  }
