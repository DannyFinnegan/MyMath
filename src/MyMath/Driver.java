package MyMath;

import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        MyMath Power1 = new MyMath();
        int answer=Power1.customPower(2,6);
        System.out.println(answer);
        MyMath Power2 = new MyMath();
        int answer2=Power2.customPower(1,3);
        System.out.println(answer2);
        MyMath Power3 = new MyMath();
        int answer3=Power3.customPower(10,5);
        System.out.println(answer3);


        MyMath SumOf1 = new MyMath();
        int answer4=SumOf1.sumOf(4);
        System.out.println(answer4);
        MyMath SumOf2 = new MyMath();
        int answer5=SumOf2.sumOf(9);
        System.out.println(answer5);
        MyMath SumOf3 = new MyMath();
        int answer6=SumOf3.sumOf(36);
        System.out.println(answer6);













      /*  MyMath P3 = new MyMath();
        int answer3=P1.factorial(5);
        JOptionPane.showMessageDialog(null,"Answer is " + answer3,"Result",JOptionPane.INFORMATION_MESSAGE);
        MyMath P4 = new MyMath();
        boolean answer4=P1.prime(13);
        JOptionPane.showMessageDialog(null,"Answer is " + answer4,"Result",JOptionPane.INFORMATION_MESSAGE);*/
    }
}
