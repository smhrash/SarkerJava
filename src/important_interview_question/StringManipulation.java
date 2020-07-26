package important_interview_question;

public class StringManipulation {

    public static void main(String[] args) {

        String str = "It will rain as soon as we expect";
        String str1 = "It will rain As soon as we expect";

        System.out.println(str.length());
        System.out.println(str.charAt(10));
        System.out.println(str.indexOf('i')); // first occurrence of i
        System.out.println(str.indexOf('i',str.indexOf('i')+1));// second occurrence of i
        System.out.println(str.indexOf("as"));
        System.out.println(str.indexOf("as",str.indexOf("as")+1));
        System.out.println(str.indexOf("hello")); // if string doesn't exit, it will show result -1

        // String comparison

        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        // sub String

        System.out.println(str.substring(0,12));
        System.out.println(str.substring(13));

        // trim

        String s= "   Sarker Rashid  ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));
        System.out.println(s.replace(""," "));
        System.out.println(s.replace(" ", "   "));

        String date= "06-20-2020";
        System.out.println(date.replace("-","/"));

        // split

        String test="Hello_World_Test_Selenium";
        String testVal [] = test.split("_");
        for (int i = 0; i <testVal.length; i++){
            System.out.println(testVal [i]);
        }

        // concatenate
        String s2= "care";
        System.out.println(s2.concat("s"));

        String a= "Sarker";
        String b="Rashid";
        int x= 300;
        int y = 200;
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(a+b+(x+y));

    }
}
