package advanced_oop.object_cloning;

public class deep_clone implements Cloneable {
    public String x;

    public deep_clone (String x) {
        this.x = x;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }
}
