The Singleton pattern is used to create and maintain one sole instance of itself and not allow other copies to exist in any given program.

    private static Singleton onlyInstance;
    private String data;
  
The instance of the class holds a Singleton member, which is essentialy itself if it has already been instantiated, as well as, for this example, any given 
data to be stored.

    private Singleton() {
        onlyInstance = this;
    }
    
    public static Singleton getOnlyInstance(){
        if (onlyInstance == null){
            onlyInstance = new Singleton();
        }
        return onlyInstance;
    }
    
The constructor is private, enforcing that the program can only call the getOnlyInstance() method to return the single instance, or instatiate one if one does not exist.

Like global variables, Singletons can be useful to store data, but can come at a lower hardware cost and namespace bloat. (https://en.wikipedia.org/wiki/Singleton_pattern)

    public String getData(){
            return data;
        }

        public void setData(String x){
            this.data = x;
        }

As I have done in my implementation, methods can be added to store or update any held data. This implementation specifically stores a String, but could certainly be modified to become generic and hold any type of data. See below:

    class Singleton<T> {

        private Singleton<T> onlyInstance;
        private T data;

        private Singleton() {
            onlyInstance = this;
        }

        public Singleton<T> getOnlyInstance(){
            if (onlyInstance == null){
                onlyInstance = new Singleton<T>();
            }
            return onlyInstance;
        }

        public T getData(){
            return data;
        }

        public void setData(T x){
            this.data = x;
        }
    }
