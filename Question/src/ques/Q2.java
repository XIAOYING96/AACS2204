
package ques;
import javax.swing.JOptionPane;

/**
 * @author xy
 */
public class Q2 {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("Large",1,1,2);
        
        JOptionPane.showMessageDialog(null,pizza.getDescription());
    }
    
}


class Pizza {
    private String pizzaSize;
    private int cheeseTopping;
    private int pepperoniTopping;
    private int hamTopping;

    public Pizza(String pizzaSize, int cheeseTopping, int pepperoniTopping, int hamTopping) {
        this.pizzaSize = pizzaSize;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
        this.hamTopping = hamTopping;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getCheeseTopping() {
        return cheeseTopping;
    }

    public void setCheeseTopping(int cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    public int getPepperoniTopping() {
        return pepperoniTopping;
    }

    public void setPepperoniTopping(int pepperoniTopping) {
        this.pepperoniTopping = pepperoniTopping;
    }

    public int getHamTopping() {
        return hamTopping;
    }

    public void setHamTopping(int hamTopping) {
        this.hamTopping = hamTopping;
    }

    public double calcCost(){
        if(pizzaSize.equalsIgnoreCase("Small")){
            return 10 + (cheeseTopping + hamTopping + pepperoniTopping) * 2;
        }
        
        else if(pizzaSize.equalsIgnoreCase("Medium")){
            return 12 + (cheeseTopping + hamTopping + pepperoniTopping) * 2;
        }
        
        else if(pizzaSize.equalsIgnoreCase("Large")){
            return 14 + (cheeseTopping + hamTopping + pepperoniTopping) * 2;
        }
        else
            return 0.0;
    }
    
    public String getDescription(){
        return " Pizza Size : " + pizzaSize + 
                "\n Chesse Topping : " + cheeseTopping +
                "\n Pepperoni Topping : " + pepperoniTopping + 
                "\n Ham Topping :" + hamTopping +
                 "\n Total : RM " + calcCost();
    }
}

