package advanced_oop.objectInterning;

public class interning {
    public static void main(String[] args){
        String s1 = "hey";
        String s2 = "hey";
        String s3 = new String("hey");

        System.out.println(s1==s2);
        System.out.println(s3==s1);
    }
    
}
