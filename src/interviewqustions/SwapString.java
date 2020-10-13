package interviewqustions;

public class SwapString {

    static String first = "United";
    static String second = "States";

    public static void main(String[] args) {

        System.out.println("======== Before swap ===========");

        System.out.println("first = "+first);
        System.out.println("second = "+second);


        System.out.println("======== After swap ===========");
        first = first + second; //UnitedStates
        second = first.substring(0,first.length()-second.length());
        first = first.substring(second.length());


        System.out.println("first = "+first);
        System.out.println("second = "+second);

        System.out.println("======== Second Option ==========");

        String firstName = "Sarker";
        String lastName = "Rashid";

        System.out.println("======== Before swap ===========");
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);

        String temp = firstName;
        firstName = lastName;
        lastName = temp;

        System.out.println("======== After swap ===========");
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);


    }
}
