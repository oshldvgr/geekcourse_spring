import decorations.Ball;
import decorations.Bulb;
import decorations.Decoration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String args[]) {
        final ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        List<Decoration> decorations = new ArrayList<>();
        decorations.add(ctx.getBean("Small_gold", Ball.class));
        decorations.add(ctx.getBean("largeGreenBall", Ball.class));
        decorations.add(ctx.getBean(Bulb.class));

        final Christmastree tree = new Christmastree(decorations);
        tree.run();

// Поменяем экземпляр класса decorations.Bulb, у которого в Scope "prototype"

        decorations.remove(decorations.size() - 1);
        decorations.add(ctx.getBean(Bulb.class));

        final Christmastree tree2 = new Christmastree(decorations);
        tree2.run();


    }
}
