package advanced_oop.object_cloning;

public class cloning implements Cloneable {
    @Override
    public cloning clone() throws CloneNotSupportedException  {
            return (cloning)super.clone();
    }
    int x;

    public static void main (String[] args) throws CloneNotSupportedException {
        cloning ob1 = new cloning();
        ob1.x = 20;

        

        cloning ob2 = ob1.clone();
        
        System.out.println("Obj1 ="+ ob1.x);
        System.out.println("obj2 = "+ ob2.x);

        ob2.x = 50;

        System.out.println("new obj2 = "+ ob2.x);
        System.out.println("obj1 = "+ ob1.x);


        cloning ob3 = ob1;
        ob3.x = 70;
        System.out.println("new obj1 = "+ ob1.x);
        System.out.println("new obj3 = "+ ob3.x);

    }
    
}
