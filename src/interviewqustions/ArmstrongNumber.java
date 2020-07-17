package interviewqustions;

public class ArmstrongNumber {
    // Write Java program to check the armstrong number.

    public static void main(String[] args) {

        int num=153;
        int actualNum=num;
        double result=0;


       while (actualNum!=0){
           int n= actualNum%10;
           result=result+Math.pow(n,3);
           actualNum=actualNum/10;
       }
       if (result==num){
           System.out.println(num+" is an armstrong number");
       }
       else{
           System.out.println(num+ " is not an armstrong number");
       }
    }
}
