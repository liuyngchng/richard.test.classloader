package richard.test.classloader;

public class TestClass {

    public static String id = "1";

    public void sayHello() {
        System.out.println("This is me from richard.test.classloader " + TestClass.id);
    }
}