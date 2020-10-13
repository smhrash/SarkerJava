package important_interview_question;

public class MainMethodOverload {

    // Q: Is it possible to overload main method?
    // A: Yes
    public static void main(String[] args) {
        System.out.println("Main Method with array");
        main("x");
        main(30);
        main(30,40);
    }
    public static void main(String args) {

        System.out.println("Main Method without array");
    }
    public static void main(int a) {

        System.out.println("Main Method with single parameter");
    }
    public static void main(int a, int b) {

        System.out.println("Main Method with double parameter");
    }
}
