package objectCasting;

public class driver {
    public static void main(String[] args) {
        superClass obj1 = new superClass(17, "Kakuru");
        //Implicit casting
        superClass obj2 = new subClassB(26, "Conrad","Software Engineer", 130000);
        //Explicit Casting
        //Promotion
        subClassA obj3 = (subClassA) new subClassB(12, "Akampa", "Worker", 12900);
        // Explicit Casting
        // Demotion
        //subClassA obj4 = (subClassA) new superClass(13,"Donald");

        //Method calling
        obj1.introduction();
        obj2.introduction();
        obj3.introduction();
        //obj4.introduction2();


    }
}
