public class ObjectImmutability {
    private final String s;
    ObjectImmutability(final String s){
        this.s = s;
    }
    public final String getName(){
        return s;
    }

    // public void setName(String newName){
    // this.s = newName;
    // }
    public static void main(String[] args) {
        ObjectImmutability obj = new ObjectImmutability("Kakuru Conrad");
        System.out.println(obj.getName());
    }
}