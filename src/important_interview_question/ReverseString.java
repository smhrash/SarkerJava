package important_interview_question;

public class ReverseString {

    // Write a Program to reverse characters
    public static void main(String[] args) {

        // First way: using for loop

        String s = "Selenium";
        // String is an immutable Class, that's why we cannot reverse the character
        // and there is no reverse method as well

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);


        // Second way: using StringBuffer Class
        StringBuffer sb= new StringBuffer(s);

        System.out.println(sb.reverse());

    }

}
