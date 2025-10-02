package advanced_oop.object_casting;

public class examExample {
    public static class animal {
        public String name;

        private void sound(){
            System.out.println("Animal sound");
        }
    }

    public static class cat extends animal {
        public String area;
        public void care(String s){
            System.out.println(s);
         }
        private void sound(){
            System.out.println("Cat sound");
        }
    }

    public static void main (String[] args){
        animal k = new cat();
        
        k.name = "Care";
        // k.area = "kanyanya";

        animal cm = (cat)new cat();
        cm.sound();
        
        k.sound();
        cat c = (cat)k;
        c.sound();
        c.area = "kdfkdf";
        System.out.println("bfhbhfbh");
        System.out.println(k);
    }
}
