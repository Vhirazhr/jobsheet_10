import java.util.Scanner;

public class CinemaWithScanner11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] audience = new String[4][2];
        String name, next;
        int row, column;

        while (true) {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            System.out.print("Enter row number: ");
            row = input.nextInt();
            input.nextLine();
            System.out.print("Enter column number: ");
            column = input.nextInt();
            input.nextLine();

            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audiences to be added? (y/n): ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;

            }
        }
        input.close();
    }
}