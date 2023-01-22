package Q3;

public class Initals
{
    public static String InitalsFinder(String FullName)
    {
        char[] Initals= new char[2];
        char FirstInital=FullName.charAt(0);
        Initals[0]=FirstInital;
        char SecondInital = 0;
        String FinalInitals;
        for (int i=0;i<FullName.length();i++)
        {

            if (Character.isWhitespace(FullName.charAt(i)))
            SecondInital=FullName.charAt(i+1);
        }
        Initals[1]=SecondInital;
        FinalInitals=String.valueOf(Initals);

        return FinalInitals;
    }
}
