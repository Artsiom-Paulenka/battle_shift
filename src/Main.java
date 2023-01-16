import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FieldGenerator fieldGenerator = new FieldGenerator(10,10);

        int[][] field = fieldGenerator.generate();

        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(field[i]));
        }

      // int a = 5;
      // int[] b = new int[10];
      // int [][] c = new int [5][8];

      //b[0] = 5;
      //b[3] = 5;
      //b[6] = 5;
      //b[7] = 5;
      //b[4] = 5;
      //b[9] = 5;

      //c[1][2] = 6;
      // System.out.println(Arrays.toString(b));
      // System.out.println(Arrays.deepToString(c));

      // int sum = 0;
      // for (int i = 0; i <10; i++) {
      //     sum += b[i];
      // }
      // System.out.println(sum);


    }
}
