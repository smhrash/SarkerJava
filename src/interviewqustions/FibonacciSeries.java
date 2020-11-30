package interviewqustions;

public class FibonacciSeries {


    public static void main(String[] args) {

        // 1 1 2 3 5 8 13 ...........

        int num = 15;
        int t1 = 0;
        int t2 = 1;
        for (int i = 1; i <= num; i++) {

            System.out.print(t2 + " ");
            int sum = t1 +t2;
            t1 = t2;
            t2 = sum;


        }

    }
}
