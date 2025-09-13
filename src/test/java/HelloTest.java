import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello() {
        String msg =new HelloWorld().print();
        System.out.println("Message from C++: " + msg );
        assert msg.equals("Hello from JNI!");
    }
}
