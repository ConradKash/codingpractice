package advanced_oop.generic_programming;

public class GenericSub<T, U, V, X> extends GenericSuper<T, U, V> {
    X obj;
	public GenericSub(T t, U u, V v, X x) {
		super(t, u, v);
        this.obj = x;
	}

    public T[] m() {
        System.err.println("This is sub class");
        return (T[]) new Object[]{this.obj, this.obj1};
    }
}
