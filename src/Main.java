public class Main {

    private static BeanCreator beanCreator = new BeanCreator();

    public static void main(String[] args) {
        final FunctionInterface function = beanCreator.newFunction();

        System.out.println(function.doSomething());

    }
}
