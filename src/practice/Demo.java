package practice;




public class Demo {

    public static void main(String[] args) {


      long num = 1239876885;

      long rev = 0;
       while (num != 0){
           rev = rev * 10 + num % 10;
           num = num / 10;

       }
       int num1 = 3456;
        System.out.println(rev);
       StringBuffer sb = new StringBuffer(String.valueOf(num1));
        System.out.println(sb.reverse());

    }
}
