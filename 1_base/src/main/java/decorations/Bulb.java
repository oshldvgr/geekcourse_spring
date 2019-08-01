package decorations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bulb extends Decoration {
    @Override
    public String toString() {
        return ("decorations.Bulb: " + super.toString());
    }
}
