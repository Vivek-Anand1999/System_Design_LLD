package snakeLadder.sevrvice;

import snakeLadder.model.Players;
import snakeLadder.repository.PlayerRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class PlayerService {
    private static final Logger log = Logger.getLogger(PlayerService.class.getName());

    public static void initializePlayerService(Scanner scanner) {
        PlayerRepository playerRepository = new PlayerRepository();
        Map<String, Players> players = PlayerRepository.getPlayersMap();
        log.info("Enter the no of players: ");
        int noOfPlayers = scanner.nextInt();
        scanner.nextLine();

        while (noOfPlayers > 0) {
            String playerName = scanner.nextLine();
            Players player = new Players();
            player.setPlayerName(playerName);
            players.put(playerName, player);
            noOfPlayers--;
        }
    }
}
