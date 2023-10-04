public class ObjectMutability{
    private String s;
    ObjectMutability(String s){
        this.s = s;
    }
    public String getName(){
        return s;
    }
    public void setName(String newName){
        this.s = newName;
    }
    public static void main(String[] args){
        ObjectMutability obj = new ObjectMutability("Conrad");
        System.out.println(obj.getName());
        //Using a setter to change the String S
        obj.setName("Kakuru");
        System.out.println(obj.getName());
    }
}