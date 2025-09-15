import com.dicomdiff.himotech.TestFile;

public class HelloWorldMe {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        TestFile testFile = new TestFile();
        testFile.printTest();
        HelloWorld mHelloWorld = new HelloWorld();
        String msg = mHelloWorld.print();
        System.out.println("Message from C++: " + msg );
    }
}
