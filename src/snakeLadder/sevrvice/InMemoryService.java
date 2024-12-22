package snakeLadder.sevrvice;

import java.util.Scanner;

public class InMemoryService {
    public InMemoryService(Scanner scanner) {
        SnakeService.initializeLadderRepository(scanner);
        LadderService.initializeLadderRepository(scanner);
        PlayerService.initializePlayerService(scanner);
    }
}
