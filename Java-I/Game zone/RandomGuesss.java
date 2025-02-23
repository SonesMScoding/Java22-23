//Lillian Sones
//24 August 2022
//Dr. Preston 
//Java Programming

import javax.swing.JOptionPane;

public class RandomGuesss {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Howdy Traveller!!");
        JOptionPane.showMessageDialog(null, "Need not any coin for this game...", null, 0);
        JOptionPane.showMessageDialog(null,"Please, think of a number...\nLet me know when you are ready");
        JOptionPane.showMessageDialog(null,"I wonder if your number was,,, "+

(1 + (int)(Math.random() * 10)));



    }
}
