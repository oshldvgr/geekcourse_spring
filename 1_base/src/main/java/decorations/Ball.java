package decorations;

import org.springframework.stereotype.Component;

@Component
public class Ball extends Decoration {
    @Override
    public String toString() {
        return ("decorations.Ball: " + super.toString());
    }
}
