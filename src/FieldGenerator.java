import java.util.Random;

public class FieldGenerator {

    private int length;
    private int width;


    public FieldGenerator(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];

        int countOfShips = 0;
        while (countOfShips < 50) {


            int a = random.nextInt(0, length);
            int b = random.nextInt(0, width);

//            for (int i = 0; i < field.length; i++) {
//                for (int j = 0; j < field[i].length; j++) {

                    //if (field[i][j] == 2) {
                    //    field[i][j] == 2;
                    //    j++;
                    //}


                    if (field[a][b] == 0) {
                        field[a][b] = 1;
                        countOfShips++;
                    }
                    if (field[a][b] == 2) {
                        field[a + 1][b + 1] = 2;
                    }

                }
                return field;
            }
        }


//for (int i = 0; i < 100; i++) {
//    int a = random.nextInt(0, length);
//    int b = random.nextInt(0, width);
//
//    if (field[a][b] == 1) {
//        i--;
//    }
//    else {
//        field[a][b] = 1;
//    }
//}
//


