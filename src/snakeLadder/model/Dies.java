package snakeLadder.model;

import java.util.Random;

public class Dies {

    public int roll() {
        return new Random().nextInt(1, 7);
    }
}
