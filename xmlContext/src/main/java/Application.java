import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String args[]) {
        final ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        final Christmastree tree_1 = ctx.getBean("tree_1", Christmastree.class);
        final Christmastree tree_2 = ctx.getBean("tree_2", Christmastree.class);

        tree_1.run();
        tree_2.run();

    }
}
