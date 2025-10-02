package advanced_oop.object_cloning;

public class cloning implements Cloneable {

    String x;
    deep_clone deep_clon;
    public  cloning(String x, deep_clone deep){
        this.x = x;
        this.deep_clon = deep;
    }

    @Override
    public Object clone() throws CloneNotSupportedException  {
            cloning geeks = (cloning)super.clone();
            geeks.deep_clon = (deep_clone) deep_clon.clone();
            return geeks;
    }

    public static void main (String[] args) throws CloneNotSupportedException {
        try {
        deep_clone clear = new deep_clone("null");
        cloning ob1 = new cloning("care", clear);
        ob1.x = "20";

        cloning ob2 = (cloning) ob1.clone();
        
        System.out.println("Obj1 ="+ ob1.x + "  " + ob1.deep_clon.x);
        System.out.println("obj2 = "+ ob2.x + "  " + ob2.deep_clon.x);

        ob2.x = "50";
        ob2.deep_clon.x= "None";

        System.out.println("new obj2 = "+ ob2.x+ "  " + ob2.deep_clon.x);
        System.out.println("obj1 = "+ ob1.x+ "  " + ob1.deep_clon.x);

        cloning ob3 = ob1;
        ob3.x = "70";
        ob3.deep_clon.x = "Null None";
        System.out.println("new obj1 = "+ ob1.x + "  " + ob1.deep_clon.x);
        System.out.println("new obj3 = "+ ob3.x  + "  "  + ob3.deep_clon.x);
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
