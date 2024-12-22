package snakeLadder.repository;

import snakeLadder.model.Players;

import java.util.HashMap;
import java.util.Map;

public class PlayerRepository {
    private static Map<String, Players> playersMap;

    public PlayerRepository() {
        playersMap = new HashMap<>();
    }

    public static Map<String, Players> getPlayersMap() {
        return playersMap;
    }
}
