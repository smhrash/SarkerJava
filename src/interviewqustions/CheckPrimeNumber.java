package interviewqustions;

public class CheckPrimeNumber {

    // Write a Java program whether a number can be Expressed as a sum of two numbers

    public static void main(String[] args) {

        // 34=3+31 5+29 11+23+17+17
        // 11

        int num = 34;
        boolean flag = true;
        for (int i = 2; i <= num / 2; i++) {
            if (checkPrimeNumber(i)) {
                if (checkPrimeNumber(num - 1)) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    flag = true;
                }
            }
        }

        if (!flag){
            System.out.println(num+" can not be expressed as the sum of the Prime number");
        }

    }

    public static boolean checkPrimeNumber(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num / i == 0) {
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }
}
