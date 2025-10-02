public final class Immutability{
    String var1;
    final String var2 = "test";

    public static void m(String s){
        System.out.println(s);
        System.out.println(s.hashCode());
    }

    public final void setVar1(String s){
        this.var1=s;
        // this.var2=s;
    }

    public static void main(String[] args){
        String s1 = new String("I am a string");

        m(s1);

        s1 = s1.replace("str", "new");
        m(s1);


        Immutability obj = new Immutability();

        obj.var1 = "Here we go";
        // obj.var2 = "Here we go 2";
        System.err.println(obj.var1);
        obj.setVar1("Here we go 22");

        System.err.println(obj.var1);

        m(obj.var1);
        System.out.println(obj.var1);
        System.out.println(obj.var2);
    }
}