package objectMutabilityImmutability;

public class mutability {
    private String mutableString;
    mutability(String s){
        this.mutableString = s;
    }
    public String getMutableString(){
        return mutableString;
    }
    public void setMutableString(String s){
        this.mutableString = s;
    }
}
