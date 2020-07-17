package interviewqustions;

public class NaturalNumberSumRecursion {
    // Write a Java Program to find out the sum of natural number using Recursion

    public static void main(String[] args) {

        //20+19+18+17+...........+3+2+1=210
        int num = 20;
        int sum = addNum(num);
        System.out.println("sum is " + sum);

    }

    public static int addNum(int num) {
        if (num != 0) {
            return num + addNum(num - 1);
        } else {
            return num;
        }
    }
}
