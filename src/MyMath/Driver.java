package MyMath;

public class Driver {
    public static void main(String[] args) {

        //this is the custom power test
        MyMath Power1 = new MyMath();
        int answer=Power1.customPower(2,6);
        System.out.println(answer);
        MyMath Power2 = new MyMath();
        int answer2=Power2.customPower(1,3);
        System.out.println(answer2);
        MyMath Power3 = new MyMath();
        int answer3=Power3.customPower(10,5);

        //this is the Sum of test
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

        //This is the Factorial Test
        MyMath factorial1 = new MyMath();
        int answer7=factorial1.factorial(5);
        System.out.println(answer7);
        MyMath factorial2 = new MyMath();
        int answer8=factorial2.factorial(33);
        System.out.println(answer8);
        MyMath factorial3 = new MyMath();
        int answer9=factorial3.factorial(6);
        System.out.println(answer9);

        //This is to check if a number is prime
        MyMath Prime1 = new MyMath();
        boolean answer10=Prime1.prime(13);
        System.out.println(answer10);
        MyMath Prime2 = new MyMath();
        boolean answer11=Prime2.prime(15);
        System.out.println(answer11);
        MyMath Prime3 = new MyMath();
        boolean answer12=Prime3.prime(17);
        System.out.println(answer12);
    }
}
