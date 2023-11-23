package objectCasting;

public class subClassA extends superClass {
    String name;
    int age;

    String jobPosition ="Cook";
    public subClassA(int ag, String nam) {
        super(ag, nam);
        this.name = nam;
        this.age = ag;
    }
    public void introduction(){
        System.out.println("Hey, I am " +name+ " and I am "+age+" years old. and i work as "+ jobPosition );
    }
}
