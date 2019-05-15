import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number < 2 || number > 10000 || number % 2 == 0) {
            System.out.println("Number not in range! \nEnter new number.");

            number = Integer.parseInt(scanner.nextLine());
        }

        Figure figure = new MMFigure(number);
        figure.draw();
    }
}
