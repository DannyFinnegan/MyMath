package Q5;

import java.sql.SQLOutput;

public class Driver {
    public static void main(String[] args) {

        Password Password1 = new Password();
        String Password = Password1.PasswordSet("Buster241");
       String Result = Password1.PasswordValid(Password);
        System.out.println(Result);

    }
}
