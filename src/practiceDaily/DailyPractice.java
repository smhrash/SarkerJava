package practiceDaily;

public class DailyPractice {

    public static void main(String[] args) {

        // fibonacci series 0 1 1 2 3 5 8 13 21 34 55 89 144

        int num = 20;
        int num1 = 0;
        int num2 = 1;
        int sum= 0;

        for (int i = 0; i <num; i++){


            System.out.print(sum+" ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;



        }

    }
}


