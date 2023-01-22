


import java.util.Scanner;

public class Game {

    private int[][] field;

    private int length;
    private int width;

    public Game(int[][] field, int length, int width) {
        this.field = field;
        this.length = length;
        this.width = width;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вам дается попыток: ");
        int numberOfAttempts = scanner.nextInt();

        int points = 0;
        for (int i = 0; i < numberOfAttempts; i++) {
            System.out.print("Введите число по горизонтали: ");
            int first = scanner.nextInt();
            System.out.print("Введите число по вертикали: ");
            int second = scanner.nextInt();

            if (first < length && second < width && first >= 0 && second >= 0) {
                int shot = field[first][second];

                if (shot == 0) {
                    System.out.println("Вы не попали");
                }
                if (shot == 1) {
                    points++;
                }
            } else {
                System.out.println("Что-то куда-то не туда");
            }
        }
        System.out.println("Ты уничтожил кораблей: " + points);
    }
}








