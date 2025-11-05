public class Generic<T> {
    T x;
    public Generic(T x){
        this.x = x;
    }
    public T getObject(){
        System.out.println(this.x);
        return this.x;
    }
        public static void main(String[] args) {
        Generic<String> g = new Generic<>("hello");
        g.getObject();
    }

}
