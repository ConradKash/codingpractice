package objectCasting;

public class superClass {
    int age = 12;
    String name;
    public superClass(int ag, String nam) {
        this.age = ag;
        this.name = nam;
    }

    public void introduction(){
        System.out.println("Hey, I am " +name+ " and I am "+age+" years old" );
    }
    public void introduction2(){
        System.out.println("Hey, I am " +name+name+ " and I am "+age+" years old" );
    }
}
