public class HelloWorld {
    public native String print();

    static {
        System.loadLibrary("app");
    }
}
