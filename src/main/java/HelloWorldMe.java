

public class HelloWorldMe {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        HelloWorld mHelloWorld = new HelloWorld();
        String msg = mHelloWorld.print();
        System.out.println("Message from C++: " + msg );
    }
}
