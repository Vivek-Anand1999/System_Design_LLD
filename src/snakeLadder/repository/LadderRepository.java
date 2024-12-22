package snakeLadder.repository;

import java.util.HashMap;
import java.util.Map;

public class LadderRepository {

    private static Map<Integer, Integer> startEndMap;

    public LadderRepository() {
        startEndMap = new HashMap<>();
    }

    public static Map<Integer, Integer> getStartEndMap() {
        return startEndMap;
    }

}
