package important_interview_question;

public class RemoveJunk {
    // Write a Java Program to Remove special char/junk

    public static void main(String[] args) {

        String s = "Selenium @#$%&&$#@#$@@ Java %$#@#$$##!";
        // using Regular Expression [^a-zA-Z0-9]
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
