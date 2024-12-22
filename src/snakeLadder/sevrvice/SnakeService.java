package snakeLadder.sevrvice;

import snakeLadder.repository.SnakeRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class SnakeService {
    private static final Logger log = Logger.getLogger(SnakeService.class.getName());

    public static boolean isSnakePos(int pos) {
        if (SnakeRepository.getStartEndMap().containsKey(pos)) return true;
        return false;
    }

    public static int snakeTail(int pos) {
        return SnakeRepository.getStartEndMap().get(pos);
    }

    public static void initializeLadderRepository(Scanner scanner) {
        SnakeRepository snakeRepository = new SnakeRepository();
        Map<Integer, Integer> snakes = SnakeRepository.getStartEndMap();
        log.info("Enter the number of snake");
        int snakeNum = scanner.nextInt();
        scanner.nextLine();

        log.info("Snake head will have height value then Tail 'Head'  'Tail' 🐍");
        while (snakeNum > 0) {
            String[] snakePos = scanner.nextLine().split(" ");
            int start = Integer.parseInt(snakePos[0]);
            int end = Integer.parseInt(snakePos[1]);
            snakes.put(start, end);
            snakeNum--;
        }
    }
}
