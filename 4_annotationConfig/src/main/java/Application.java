
import decorations.Ball;
import decorations.Bulb;
import decorations.Decoration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(".decorations")
public class Application {
    public static void main(String args[]) {
        final ApplicationContext ctx =
                new AnnotationConfigApplicationContext(Application.class);

        Decoration ball_1 = ctx.getBean(Ball.class);
        Decoration ball_2 = ctx.getBean(Ball.class);
        Decoration bulb_1 = ctx.getBean(Bulb.class);
        Decoration bulb_2 = ctx.getBean(Bulb.class);

        System.out.println(ball_1.hashCode());
        System.out.println(ball_2.hashCode());
        System.out.println(bulb_1.hashCode());
        System.out.println(bulb_2.hashCode());


    }
}
