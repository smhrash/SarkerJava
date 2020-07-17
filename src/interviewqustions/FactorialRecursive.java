package interviewqustions;

public class FactorialRecursive {

    // Write a Java Program to find Factorial of number using Recursion

    public static void main(String[] args) {
        System.out.println(multiplyNumber(5));
        System.out.println(multiplyNumber(10));


    }
    public static  int multiplyNumber(int num){
        if (num >= 1){
            return num *multiplyNumber(num-1);
        }
        else {
            return 1;
        }
    }
}
