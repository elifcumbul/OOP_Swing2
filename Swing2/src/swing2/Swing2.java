/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing2;

import javax.swing.JOptionPane;

/**
 *
 * @author elifc
 */
public class Swing2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int midterm1, midterm2;
        int final1;
        
        String smidterm1 = JOptionPane.showInputDialog("Enter the 1. midterm note: ");
        midterm1 = Integer.parseInt(smidterm1);
        
        while(midterm1<0 || midterm1>100){
            smidterm1 = JOptionPane.showInputDialog(null, "Enter the 1. midterm note: ", "Midterm1", JOptionPane.WARNING_MESSAGE);
            midterm1 = Integer.parseInt(smidterm1);
        }
        
        String smidterm2 = JOptionPane.showInputDialog("Enter the 2. midterm note: ");
        midterm2 = Integer.parseInt(smidterm2);
        
        while(midterm2<0 || midterm2>100){
            smidterm2 = JOptionPane.showInputDialog(null, "Enter the 2. midterm note: ", "Midterm2", JOptionPane.WARNING_MESSAGE);
            midterm2 = Integer.parseInt(smidterm2);
        }       
        
        String sfinal1 = JOptionPane.showInputDialog(null, "Enter the final note: ", "Final", JOptionPane.QUESTION_MESSAGE);
        final1 = Integer.parseInt(sfinal1);
        
        while(midterm2<0 || midterm2>100){
            sfinal1 = JOptionPane.showInputDialog(null, "Enter the final note: ", "Final", JOptionPane.WARNING_MESSAGE);
            final1 = Integer.parseInt(sfinal1);
        }         
        
        double result = midterm1*0.2 + midterm2*0.2 + final1*0.6;
        String message = "";
        
        if(result>50){
            message += "Congratulations!, you've passed the course";
        }else{
            message += "You've failed the course";
        }
        
        JOptionPane.showMessageDialog(null, message, "The Result", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
