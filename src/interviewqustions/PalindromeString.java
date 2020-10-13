package interviewqustions;

public class PalindromeString {

    public static void main(String[] args) {

        String name= "SABBAS";
        String rev = "";
        String actualName = name;

        for (int i = name.length()-1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

        if (actualName.equals(rev)){
            System.out.println(actualName +" is palindrome");
        }else{
            System.out.println(actualName +" is not palindrome");
        }


    }
}
