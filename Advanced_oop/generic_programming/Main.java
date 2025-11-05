package advanced_oop.generic_programming;

public class Main {

    public static void main(String[] args){
        GenericSuper var2 = new GenericSuper<Integer, String, Integer>(2, "hello",5);

        var2.obj2 =3;

        System.out.println(var2.m()[0] + "  " + var2.m()[1]);

        System.out.println(var2.getObjects()[0] + " " + var2.getObjects()[1] + " " + var2.getObjects()[2]);

        GenericSuper var3 = new GenericSub<Integer, String, Integer, String>(1, "2", 3, "4");
        System.out.println(var3.m()[0] + "  " + var3.m()[1]);

        System.err.println("This is explicit casting to access m that has been in the subtype");
        GenericSub car = (GenericSub)var3;
        // var3.m();
        System.out.println(car.m()[0]+ "  "+ car.m()[1]);

    }
    
}
