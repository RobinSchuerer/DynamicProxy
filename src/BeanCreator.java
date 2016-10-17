import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class BeanCreator {

    public static FunctionInterface newFunction() {
        return (FunctionInterface) Proxy.newProxyInstance(
            FunctionInterface.class.getClassLoader(),
            new Class<?>[] { FunctionInterface.class },
            newImplementation());
    }

    private static InvocationHandler newImplementation() {
        return (proxy, method, args) -> "yeah";
    }

}
