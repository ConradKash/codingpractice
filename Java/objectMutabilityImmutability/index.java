package objectMutabilityImmutability;

public class index {
    public static void main(String[] args) {
        immutability objI = new immutability("This is an Immutable String");
        System.out.println(objI.getString());

        mutability objM = new mutability("This may be mutable");
        System.out.println(objM.getMutableString());
        //now here we change the name of the mutableString using the set function
        objM.setMutableString("Lets Change the test of the class");
        System.out.println(objM.getMutableString());

        //Trying to edit the immutable object
        //objI.setMutableString("IT brings so i have commented it oout")
    }
}
