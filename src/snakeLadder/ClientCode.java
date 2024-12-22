package snakeLadder;

import snakeLadder.sevrvice.BoardService;
import snakeLadder.sevrvice.InMemoryService;

import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InMemoryService inMemoryService = new InMemoryService(scanner);
        BoardService boardService = new BoardService();
        boardService.startGame();

    }

}
