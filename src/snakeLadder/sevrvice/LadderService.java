package snakeLadder.sevrvice;

import snakeLadder.repository.LadderRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class LadderService {

    private static final Logger log = Logger.getLogger(LadderService.class.getName());

    public static void initializeLadderRepository(Scanner scanner) {
        LadderRepository ladderRepository = new LadderRepository();
        Map<Integer, Integer> ladders = LadderRepository.getStartEndMap();
        log.info("Enter the number of ladder");
        int ladderNum = scanner.nextInt();
        scanner.nextLine();
        log.info("Ladder tail will have low value then Head 'Tail'  'Head' 🥢 ");

        while (ladderNum > 0) {
            String[] ladderPos = scanner.nextLine().split(" ");
            int start = Integer.parseInt(ladderPos[0]);
            int end = Integer.parseInt(ladderPos[1]);
            ladders.put(start, end);
            ladderNum--;
        }
    }

    public static boolean isLadderPos(int pos) {
        if (LadderRepository.getStartEndMap().containsKey(pos)) return true;
        return false;
    }

    public static int ladderTop(int pos) {
        return LadderRepository.getStartEndMap().get(pos);
    }
}
