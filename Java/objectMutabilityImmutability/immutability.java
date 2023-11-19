package objectMutabilityImmutability;

public class immutability {
    private final String firstString;


    immutability(final String s) {
        this.firstString = s;
    }

    public String getString(){
        return firstString;
    }
}

