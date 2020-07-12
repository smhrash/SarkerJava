package interviewqustions;

public class NumberOFDigits {

    public static void main(String[] args) {

        // 1234_____4
        // 123____3

        long num =1234486368422688533l;
        int count=0;
        while (num!=0){
            num=num/10; //123
            ++count;
        }
        System.out.println("Number of digits : "+count);
    }
}
