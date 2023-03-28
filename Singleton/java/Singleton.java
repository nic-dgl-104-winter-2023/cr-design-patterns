package Singleton.java;

public class Singleton {

    private static Singleton onlyInstance;
    private String data;

    private Singleton() {
        onlyInstance = this;
    }

    public static Singleton getOnlyInstance(){
        if (onlyInstance == null){
            onlyInstance = new Singleton();
        }
        return onlyInstance;
    }

    public String getData(){
        return data;
    }

    public void setData(String x){
        this.data = x;
    }
}
