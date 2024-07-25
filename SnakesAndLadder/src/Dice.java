import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public static final int FACE_MIN_COUNT = 1;
    public static final int FACE_MAX_COUNT = 6;

    private final int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int totalSum = 0;

        for (int diceUsed = 0; diceUsed < this.diceCount; ++diceUsed) {
            totalSum += ThreadLocalRandom.current().nextInt(FACE_MIN_COUNT, FACE_MAX_COUNT + 1);
        }

        return totalSum;
    }
}
