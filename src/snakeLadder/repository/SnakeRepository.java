package snakeLadder.repository;

import java.util.HashMap;
import java.util.Map;

public class SnakeRepository {

    private static Map<Integer, Integer> startEndMap;

    public SnakeRepository() {
        startEndMap = new HashMap<>();
    }

    public static Map<Integer, Integer> getStartEndMap() {
        return startEndMap;

    }
}
