import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Christmastree {

    private Ball ball;
    private Bulb bulb;

    public void run() {
        System.out.println("Ball: " + ball + "\n" + "Bulb: " + bulb);
    }

}
