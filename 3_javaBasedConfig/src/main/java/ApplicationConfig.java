import decorations.Ball;
import decorations.Bulb;
import decorations.Colors;
import decorations.Size;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ApplicationConfig {

    @Bean("Small_gold")
    public Ball smallGoldBall() {
        Ball ball = new Ball();
        ball.setSize(Size.SMALL);
        ball.setColor(Colors.GOLD);
        return ball;
    }

    @Bean
    public Ball largeGreenBall() {
        Ball ball = new Ball();
        ball.setSize(Size.LARGE);
        ball.setColor(Colors.GREEN);
        return ball;
    }

    @Bean
    @Scope("prototype")
    public Bulb mediumBlueBulb() {
        Bulb bulb = new Bulb();
        bulb.setSize(Size.MEDIUM);
        bulb.setColor(Colors.BLUE);
        return bulb;
    }
}
