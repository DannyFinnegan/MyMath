package Q4;

public class Driver {
    public static void main(String[] args)
    {

    WordCount Count1 = new WordCount();
    int Words1 = Count1.NumberCounter("Hello and my name is Danny");
    System.out.println(Words1);
    WordCount Count2 = new WordCount();
    int Words2 = Count2.NumberCounter("This code is now hopefully working Please");
    System.out.println(Words2);
    WordCount Count3 = new WordCount();
    int Words3 = Count3.NumberCounter("This code is now hopefully working, this text should now contain 13 words");
    System.out.println(Words3);
    }
}
