package Q3;

public class Driver {
    public static void main(String[] args) {

        Initals InitalsClass1=new Initals();
        String Initals1 = Initals.InitalsFinder("Danny Finnegan");
        System.out.println(Initals1);
        Initals InitalsClass2=new Initals();
        String Initals2 = InitalsClass2.InitalsFinder("Tom Clarke");
        System.out.println(Initals2.toString());
        Initals InitalsClass3=new Initals();
        String Initals3 = InitalsClass3.InitalsFinder("John Targaryen");
        System.out.println(Initals3);
    }
}
