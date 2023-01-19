package Q2;


import javax.swing.*;
import java.util.ArrayList;

public class NumberCounter {

    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        String numberAsString;
        int number;
        numberAsString=JOptionPane.showInputDialog(null,"Please enter a number: ","Number",JOptionPane.INFORMATION_MESSAGE);
        number=Integer.parseInt(numberAsString);
        Numbers.add(number);

        while (number >=1)
        {
            numberAsString=JOptionPane.showInputDialog(null,"Please enter a number: ","Number",JOptionPane.INFORMATION_MESSAGE);
            number= Integer.parseInt(numberAsString);
            Numbers.add(number);
        }
        Numbers.remove(Numbers.size()-1);
        System.out.println(Numbers.toString());
    }
}
