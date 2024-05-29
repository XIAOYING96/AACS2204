package ques;

import javax.swing.JOptionPane;


public class Question{

    /**
     * @xy
     */
    public static void main(String[] args) {
        String num;
      
        num = JOptionPane.showInputDialog("Enter an integer ");
       
        boolean isNum = true;
        try{
            Integer.parseInt(num);
        }catch(NumberFormatException e){
            isNum = false;
        }
        
        if(isNum == true){
            JOptionPane.showMessageDialog(null,"You entered the integer value "+num);
        }else
            JOptionPane.showMessageDialog(null,num+" is not an integer value","Error", JOptionPane.ERROR_MESSAGE);
     
    }

//    public boolean isNumeric(String num){
//        boolean isNum = true;
//        try{
//            Integer.parseInt(num);
//
//        }catch(NumberFormatException e){
//            isNum = false;
//        }
//    }

    
}
