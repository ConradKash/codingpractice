package advanced_oop.generic_programming;

public class GenericSuper<T, U, V> {
    T obj1;
    U obj2;
    V obj3;

    public GenericSuper (T obj1, U obj2, V obj3){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    @SuppressWarnings("unchecked")
    public T[] getObjects() {
        Object[] array = new Object[]{this.obj1, this.obj2, this.obj3};
        return (T[]) array;
    }

    public T[] m() {
        System.err.println("Thisi is super class");
        return (T[]) new Object[]{this.obj1, this.obj2};
    }
	
}
