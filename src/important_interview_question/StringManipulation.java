package important_interview_question;

public class StringManipulation {

    public static void main(String[] args) {

        String st = "United States of America is a large country";
        String st1 = "United States Of America is a large country";

        // length of a String
        System.out.println(st.length());
        // find out character by number
        System.out.println(st.charAt(7));
        // find out character position
        System.out.println(st.indexOf('S'));
        // find out String position
        System.out.println(st.indexOf("Sta"));
        // find out first occurrence of a character
        System.out.println(st.indexOf("i"));
        // find out second occurrence of a character
        System.out.println(st.indexOf('i',st.indexOf('i')+1));
        // find out third occurrence of a character
        System.out.println(st.indexOf('i',st.indexOf('i',st.indexOf('i')+1)+1));
        System.out.println(st.charAt(25));
        // If any String is not available, it will return -1
        System.out.println(st.indexOf("hello"));
        // Case sensitivity
        System.out.println(st.equals(st1));
        // Use Case ignore
        System.out.println(st.equalsIgnoreCase(st1));
        // Print a part of a String
        System.out.println(st.substring(17,24));
        System.out.println(st.charAt(17));
        System.out.println(st.charAt(23));

        String st2 ="    United States   ";
        // trim method remove before and after spaces
        System.out.println(st2.trim());

        // Replacement of a String
        System.out.println(st.replace("States","Kingdom"));
        // replace middle space of two String
        System.out.println(st2.replace(" ",""));

        // split method
        String st3= "United_States_Of_America";
        String [] st4 = st3.split("_");

        for (String s:st4){
            System.out.print(s+" ");

        }
        // Concat
        System.out.println(st3.concat("ns"));

        // others
        String a = "Banana";
        String b = "Tomato";
        int x = 20;
        int y = 10;

        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(a+b+(x+y));

    }
}
