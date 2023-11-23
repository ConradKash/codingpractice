package objectCasting;

public class subClassB extends subClassA{
    String name;
    int age;

    String jobPosition= "Driver";

    int pay = 12000;
    public subClassB(int ag, String nam, String jp, int payment) {
        super(ag, nam);
        this.age = ag;
        this.name = nam;
        this.jobPosition = jp;
        this.pay = payment;
    }
    public void introduction(){
        System.out.println("Hey, I am " +name+ " and I am "+age+" years old. and i work as "+ jobPosition +" and i earn "+ pay);
    }
    public void introduction2(){
        System.out.println("Hey, I am " +name+name+ " and I am "+age+age+ " years old" );
    }
}
