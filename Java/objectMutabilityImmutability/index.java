package objectMutabilityImmutability;

public class index {
    String var1;
    public void immutableMethod(String s){
        System.out.println(s+" method");
    }
    public static void main(String[] args) {
        String s1 = new String("I am immutable");

        System.out.println(s1);
        s1.replaceAll("mutable", "String");
        System.out.println(s1);

        String s2 = "I am mutable";
        s2.replaceAll("mutable", "String");
        System.out.println(s2);

        immutability objI = new immutability("This is an Immutable String");
        System.out.println(objI.getString());

        mutability objM = new mutability("This may be mutable");
        System.out.println(objM.getMutableString());
        //now here we change the name of the mutableString using the set function
        objM.setMutableString("Lets Change the test of the class");
        System.out.println(objM.getMutableString());

        //Trying to edit the immutable object
        //objI.setMutableString("IT brings so i have commented it oout")
        index objectI = new index();
        objectI.var1 = "First Value";
        System.out.println(objectI.var1);

        objectI.var1 = "Second Value";
        System.out.println(objectI.var1);
        objectI.immutableMethod("Immutable");
    }
}
