package interviewqustions;


public class SwapNumbers {

    public static void main(String[] args) {
        int a = 40;
        int b = 30;

        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("After swapping");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("===================== Without temp variable ========================");

        int x = 400;
        int y = 328;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);

        System.out.println("===================== Another option Without temp variable ========================");

        int c = 700;
        int d = 658;

        c = c * d;
        d = c / d;
        c = c / d;
        System.out.println("C = " + c);
        System.out.println("D = " + d);


        System.out.println("===================== Another option Without temp variable ========================");

        int i = 600;
        int j = 458;

        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
