package Q4;

public class WordCount {
    public static int NumberCounter(String Words)
    {
        int wordCount=1;
        for (int i=0;i<Words.length()-1;i++)
        {
            if (Character.isWhitespace(Words.charAt(i)) && !(Character.isWhitespace(Words.charAt(i+1))))
            {
                wordCount++;
            }
        }
        return wordCount;
    }
}
