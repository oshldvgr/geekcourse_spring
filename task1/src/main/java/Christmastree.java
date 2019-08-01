import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Christmastree {

    private List<Decoration> decorations;

    public void run() {
        System.out.println(decorations);
    }

}
