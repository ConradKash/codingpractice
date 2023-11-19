package objectInterning;

public class objintern {
    public static void main(String[] args){

        String s1 = new String("objectinterning");

        String s2 = s1.intern();

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        String s5 = "objectinterning";

        System.out.println(s2 == s5);

        String s3 = s1.concat("objectinterning");

        String s4 = s3.intern();

        System.out.println(s3 == s4);

        String s6 = "objectinterningobjectinterning";

        System.out.println(s4 == s6);

    }
}
