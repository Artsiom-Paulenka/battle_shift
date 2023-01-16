import java.util.Random;

public class FieldGenerator {

    private int length;
    private int width;

    public FieldGenerator(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];

        int a = random.nextInt(0,10);
        int b = random.nextInt(0,10);

        field[a][b] = 1;
        return field;
    }

}
