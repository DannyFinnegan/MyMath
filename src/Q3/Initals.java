package Q3;

public class Initals
{
    public static String InitalsFinder(String fullname)
    {
        char[] Initals= new char[2];
        char FirstInital = fullname.charAt(0);
        Initals[0]=FirstInital;
        char SecondInital = 0;
        String FinalInitals;
        for (int i=0;i<fullname.length();i++)
        {

            if (Character.isWhitespace(fullname.charAt(i)))
                SecondInital = fullname.charAt(i+1);
        }
        Initals[1]=SecondInital;
        FinalInitals=String.valueOf(Initals);

        return FinalInitals;
    }
}
