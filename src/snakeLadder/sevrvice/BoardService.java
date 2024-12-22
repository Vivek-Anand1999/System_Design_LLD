package snakeLadder.sevrvice;

import snakeLadder.model.Board;
import snakeLadder.model.Dies;
import snakeLadder.model.Players;
import snakeLadder.repository.PlayerRepository;

import java.util.logging.Logger;

public class BoardService {
    private static final Logger log = Logger.getLogger(BoardService.class.getName());
    public Board board = new Board(100);
    Dies dies = new Dies();

    public int rollDies() {
        return dies.roll();
    }

    public int movePlayer(String playerName) {
        Players player = PlayerRepository.getPlayersMap().get(playerName);
        int currentPosition = player.getPiecePosition();
        if (currentPosition == board.getEndSize()) {
            log.info("Game over");
        }
        int dieValue = rollDies();
        int updatePos = currentPosition + dieValue;
        if (SnakeService.isSnakePos(updatePos)) {
            updatePos = SnakeService.snakeTail(updatePos);
        }
        if (LadderService.isLadderPos(updatePos)) {
            updatePos = LadderService.ladderTop(updatePos);
        }
        if (updatePos <= board.getEndSize()) {
            player.setPiecePosition(updatePos);
            log.info(playerName + " rolled a die " + dieValue + " and move from " + currentPosition + " to " + updatePos);
        }
        if (updatePos == board.getEndSize()) {
            player.setPiecePosition(updatePos);
            log.info(playerName + " win the game ");
        }
        return updatePos;
    }

    public void startGame() {
        while (true) {
            for (String playerName : PlayerRepository.getPlayersMap().keySet()) {
                int updatePos = movePlayer(playerName);
                if (updatePos == board.getEndSize()) {
                    return;
                }
            }
        }
    }
}
