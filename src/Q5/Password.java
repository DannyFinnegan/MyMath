package Q5;

import javax.swing.*;

public class Password {
    public String PasswordSet(String Password)
    {
        boolean Length = false;
        boolean Uppercase = false;
        boolean Lowercase = false;
        boolean digit = false;
        boolean valid = false;
        String ResultTrue = "This password is Valid";
        String ResultFalse = "This password is not valid, Please try again";

        for (int i =0;i<=Password.length()+1;i++)
        {
            if (Password.length()>=8) {
                Length = true;
            }
        }
        for (int j = 0; j<=Password.length();j++)
        {
            if (Character.isUpperCase(Password.charAt(j)));
            {
                Uppercase=true;
            }
            if (Character.isLowerCase(Password.charAt(j)))
            {
                Lowercase=true;
            }
            if (Character.isDigit(Password.charAt(j)))
            {
                digit=true;
            }
        }
        if (Length==true&&Uppercase==true&&Lowercase==true&&digit==true)
        {
            valid=true;
        }
        if (valid==true)
        {
            return ResultTrue;
        }
        else
        {
            return ResultFalse;
        }

    }

    public String PasswordValid(String Password)
    {

        String Attempt=JOptionPane.showInputDialog(null,"Please enter password","Password",JOptionPane.INFORMATION_MESSAGE);
        if(Attempt==Password)
        {

        }

     if(Attempt==Password)
        {
            return ("Welcome");
        }
        else {
            return ("No");
        }
    }
}
